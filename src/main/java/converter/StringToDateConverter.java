package converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date>{
    // 日期类型模板
    private String datePattern;
    
    public StringToDateConverter(String datePattern) {
        this.datePattern = datePattern;
    }
    
    @Override
    public Date convert(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);
            return dateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("日期转换失败");
            return null;
        }
    }
}
