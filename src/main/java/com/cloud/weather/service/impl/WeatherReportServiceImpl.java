package com.cloud.weather.service.impl;

import com.cloud.weather.service.WeatherDataClient;
import com.cloud.weather.service.WeatherReportService;
import com.cloud.weather.vo.Weather;
import com.cloud.weather.vo.WeatherResponse;
import com.cloud.weather.vo.Yesterday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataClient weatherDataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        //改为由天气数据api提供数据
        WeatherResponse weatherResponse = weatherDataClient.getDataByCityId(cityId);
        return weatherResponse.getData();
    }
}
