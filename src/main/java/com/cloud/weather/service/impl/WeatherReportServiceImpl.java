package com.cloud.weather.service.impl;

import com.cloud.weather.service.DataClient;
import com.cloud.weather.service.WeatherReportService;
import com.cloud.weather.vo.Weather;
import com.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private DataClient dataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        //改为由天气数据api提供数据
        WeatherResponse weatherResponse = dataClient.getDataByCityId(cityId);
        return weatherResponse.getData();
    }
}
