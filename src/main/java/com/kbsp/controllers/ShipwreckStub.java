//package com.kbsp.controllers;
//
//import com.kbsp.models.Shipwreck;
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class ShipwreckStub {
//	private static Map<BigInteger, Shipwreck> wrecks = new HashMap<>();
//	private static  BigInteger idIndex = new BigInteger("3");
//
//	//populate initial wrecks
//	static {
//		Shipwreck a = new Shipwreck(new BigInteger("1"), "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
//		wrecks.put(new BigInteger("1"), a);
//		Shipwreck b = new Shipwreck(new BigInteger("2"), "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
//		wrecks.put(new BigInteger("2"), b);
//		Shipwreck c = new Shipwreck(new BigInteger("3"), "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
//		wrecks.put(new BigInteger("3"), c);
//	}
//
//	public static List<Shipwreck> list() {
//		return new ArrayList<Shipwreck>(wrecks.values());
//	}
//
//	public static Shipwreck create(Shipwreck wreck) {
//		idIndex.add(idIndex);
//		wreck.setId(idIndex);
//		wrecks.put(idIndex, wreck);
//		return wreck;
//	}
//
//	public static Shipwreck get(BigInteger id) {
//		return wrecks.get(id);
//	}
//
//	public static Shipwreck update(BigInteger id, Shipwreck wreck) {
//		wrecks.put(id, wreck);
//		return wreck;
//	}
//
//	public static Shipwreck delete(BigInteger id) {
//		return wrecks.remove(id);
//	}
//}
