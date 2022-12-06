package com.mychurch.service.common;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MCServiceCommon {

	public static String formatTimeStamp(Timestamp ts) {
		if (ts == null)
			return null;
		return new SimpleDateFormat("yyyyMMddHHmmss").format(ts.getTime());
	}

	public static String CurrentDate() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date().getTime());
	}

	public static Timestamp CurrTimeStamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	public static String CurrentDateTime() {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date().getTime());
	}

	public static String FormatStringAsEmpty(String input) {
		return MCServiceCommon.IsEmptyString(input) ? "" : input;
	}

	public static String FormatStringAsNull(String input) {
		return MCServiceCommon.IsEmptyString(input) ? null : input;
	}

	public static int FormatNumberAsNeg(String input) {
		return MCServiceCommon.IsEmptyString(input) ? -1 : Integer.parseInt(input);
	}

	public static String newUUID() {
		return UUID.randomUUID().toString();
	}

	public static boolean IsEmptyString(String input) {
		return input == null || input.trim().isEmpty();
	}

	public static Object JsonToClassIgnore(String json, final Class<?> clazz) {// Ignore Unrecognized field
		if (json == null || json.trim().length() <= 0)
			return null;
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Object JsonToClass(String json, final Class<?> clazz) {
		if (json == null || json.trim().length() <= 0)
			return null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(json, clazz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String ClassToJson(Object object) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean StringEqual(String str1, String str2) {
		if (str1 == null && str2 == null)
			return true;
		if (str1 == null || str2 == null)
			return false;
		if (str1.compareTo(str2) == 0) {
			return true;
		}
		return false;
	}

	public static boolean GetBooleanAtPosition(String input, int position) {
		if (input == null || input.length() < position) {
			return false;
		}
		char c = input.charAt(position);
		if (c == '1')
			return true;
		return false;
	}

	public static <T> List<T> PickNRandom(List<T> lst, int n) {
		final List<T> copy = new ArrayList<T>(lst);
		Collections.shuffle(copy);
		List<T> results = n > copy.size() ? copy.subList(0, copy.size()) : copy.subList(0, n);
		return results;
	}

	// secret: character length: 16
	public static String encrypt(String text, String secret) {
		try {
			final String ALGORITHM = "AES";
			final Key aesKey = new SecretKeySpec(secret.getBytes(), ALGORITHM);
			final Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			final byte[] encrypted = cipher.doFinal(text.getBytes());
			return Base64.getEncoder().encodeToString(encrypted);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
			return text;
		}
	}

	// secret: character length: 16
	public static String decrypt(String encrpytedText, String secret) {
		try {
			final String ALGORITHM = "AES";
			final Key aesKey = new SecretKeySpec(secret.getBytes(), ALGORITHM);
			final Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			return new String(cipher.doFinal(Base64.getDecoder().decode(encrpytedText)));
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
			return encrpytedText;
		}
	}

}
