package org.young.irpc.framework.core.common.util;

import java.util.List;

/**
 * @ClassName ListUtil
 * @Description TODO
 * @Author young
 * @Date 2023/2/18 下午12:06
 * @Version 1.0
 **/
public class ListUtil {

    public static boolean isEmpty(List list){
        return list==null || list.isEmpty();
    }

    public static boolean isNotEmpty(List list){
        return !isEmpty(list);
    }
}
