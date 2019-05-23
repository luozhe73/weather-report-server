package com.cloud.weather.service.impl;

import com.cloud.weather.service.WeatherReportService;
import com.cloud.weather.vo.Weather;
import com.cloud.weather.vo.Yesterday;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Override
    public Weather getDataByCityId(String cityId) {
        //TODO 改为由天气数据api提供数据
        Weather weather=new Weather("北京","优","haixin","30",new Yesterday(),null);
        return weather;
    }
}
