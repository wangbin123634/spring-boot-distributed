package com.jdy.b2b.api.common.constants.annotations;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by strict on 2017/9/23.
 *
 * ClassName:DateJsonSerializerYMDHMS <br/>
 * Function: 日期类型格式化，格式化为：yyyy-MM-dd HH:mm:ss 格式. 用法如下：<br/>
 * Reason:   @JsonSerialize(using=DateJsonSerializerYMDHMS.class)
 *           @Column(name="BIRTHDAY")
 *           public Date getBirthday() {
 *              return birthday;
 *           }
 *          . <br/>
 * Date:     2014年7月10日 下午1:26:08 <br/>
 * @author   zhangzhaoyu
 * @version   1.0
 * @since    JDK 1.7
 * @see
 */
public class DateJsonSerializerYMDHMS extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator jgen,
                          SerializerProvider provider) throws IOException,
            JsonProcessingException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(value);
        jgen.writeString(formattedDate);
    }

}