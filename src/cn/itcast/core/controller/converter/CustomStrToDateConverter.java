package cn.itcast.core.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 *使用ConversionServiceFactoryBean转换器需要自定义时间转化器
 *如果使用的是FormattingConversionServiceFactoryBean
 *可以不用自定义转化器
 *可以在pojo中配置@DataTimeFormat来格式化时间<br/><br/>
 *
 *自定义转化器的泛型类型:<br/>
 * S - source源的类型<br/>
 * T - target目标的类型<br/>
 * 
 * @author Derek Sun
 */
public class CustomStrToDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(source);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
