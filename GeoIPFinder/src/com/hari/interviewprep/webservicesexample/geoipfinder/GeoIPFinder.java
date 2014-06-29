package com.hari.interviewprep.webservicesexample.geoipfinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

import java.net.Inet4Address;
import java.nio.*;

public class GeoIPFinder {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Argument length should be 1");
		} else {
			String ipAddress = args[0];
			GeoIPService geoIp = new GeoIPService();
			GeoIPServiceSoap geoIpServiceSoap = geoIp.getGeoIPServiceSoap();
			GeoIP geoIP = geoIpServiceSoap.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}
	}
}
