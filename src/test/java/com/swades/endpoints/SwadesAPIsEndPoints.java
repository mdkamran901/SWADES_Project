package com.swades.endpoints;

import com.swades.utilities.ReadConfig;

public class SwadesAPIsEndPoints {
	static ReadConfig readconfig = new ReadConfig();
	
	  static String baseUrl = readconfig.getbaseUrl();
	
	//User APis List
	public static final String token = baseUrl + "/user/api/v1/auth/login";
	
	
	//Master APis List
	public static final String GET_MasterStationall =  baseUrl + "/MasterApi/v1/MasterStation/all";
	public static final String GET_MasterResponseall = baseUrl + "/MasterApi/v1/MasterResponse/all"; //?Flag=99
	public static final String GET_findAllSeries = baseUrl + "/MasterApi/v1/findAllSeries";
	public static final String GET_stationWiseSeriesData = baseUrl + "/MasterApi/v1/stationWiseSeriesData/all"; //?station_id=12
	public static final String GET_master_rl = baseUrl + "/MasterApi/v1/master-rl/{stationId}"; //138
	public static final String GET_getNearestStations = baseUrl + "/MasterApi/v1/getNearestStations/{stationId} "; //85";
	
	//RainFall APis List
	public static final String GET_rainfall = baseUrl + "/data/v1/api/rainfall"; //?stationId=1&month=9&year=1988
	public static final String GET_climaticall = baseUrl + "/data/v1/climatic/all"; //?stationId=45&month=12&year=2015
	public static final String GET_ObsDataHRall = baseUrl + "/data/v1/ObsDataHR/all"; //?stationId=45&datatypeId=41&month=3&year=2005";
	public static final String GET_reportsargandsrgdata = baseUrl + "/data/v1/api/reports/argandsrgdata"; //?station_id=15&fromDate=1999-08-13&toDate=1999-09-15";
	public static final String GET_reportsargtdandsrgdata = baseUrl + "/data/v1/api/reports/argtdandsrgdata";//?station_id=15&fromDate=2000-07-01&toDate=2000-07-02";
	public static final String GET_reportsargandsunshinedata = baseUrl + "/data/v1/api/reports/argandsunshinedata";//?station_id=45&fromDate=2015-12-28&toDate=2015-12-31
	public static final String GET_reportsclimaticReport = baseUrl + "/data/v1/api/reports/climaticReport";//?station_ids=14&station_ids=15&flag=4&frequency=2&fromDate=1999-10-08&toDate=2000-10-08
	public static final String GET_reportsrainfallReport = baseUrl + "/data/v1/api/reports/rainfallReport";//?station_ids=14&frequency=1&fromDate=1998-08-01&toDate=2000-04-26&station_ids=15
	public static final String GET_getobsdata = baseUrl + "/data/v1/api/get-obs-data"; //stationId=138&month=1&year=2002
	public static final String Delete_obs_data = baseUrl +"/data/v1/api/delete-obs-data"; //?stationId=138&frequency=4&month=12&year=2001";
	public static final String GET_getsumsqsdata = baseUrl + "/data/v1/api/get-sum-sqs-data"; //?stationId=138&month=5&year=2024
	public static final String GEt_get_fps_hrly_data = baseUrl + "/data/v1/get-fps-hrly-data"; //?stationId=136&year=2024&month=5
	public static final String GET_getmetric__hrly_data = baseUrl + "/data/v1/get-metric-hrly-data"; //?stationId=138&year=2024&month=05"
	public static final String GET_getFlowMeasurementData = baseUrl + "/data/v1/getFlowMeasurementData"; //?stationId=138&day=22&month=6&year=2007";
	
	
	
	
	
	
}



