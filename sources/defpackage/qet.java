package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qet {
    private static final agfm b = agfm.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listH = b.h(str);
        return listH.size() != 3 ? "MALFORMED" : (String) listH.get(0);
    }

    public final axgd b(axgd axgdVar) {
        axfy axfyVar = axgdVar.e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        if ((axfyVar.b & 1) == 0) {
            return axgdVar;
        }
        axfy axfyVar2 = axgdVar.e;
        if (axfyVar2 == null) {
            axfyVar2 = axfy.a;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        aihf builder = axfyVar2.toBuilder();
        Long l = (Long) concurrentHashMap.get(Long.valueOf(((axfy) builder.instance).c));
        l.getClass();
        aihf builder2 = axgdVar.toBuilder();
        long jLongValue = l.longValue();
        builder.copyOnWrite();
        axfy axfyVar3 = (axfy) builder.instance;
        axfyVar3.b |= 1;
        axfyVar3.c = jLongValue;
        builder2.copyOnWrite();
        axgd axgdVar2 = (axgd) builder2.instance;
        axfy axfyVar4 = (axfy) builder.build();
        axfyVar4.getClass();
        axgdVar2.e = axfyVar4;
        axgdVar2.b |= 4;
        return (axgd) builder2.build();
    }

    public final axgd c(int i, axgd axgdVar) {
        axfy axfyVar = axgdVar.e;
        if (axfyVar == null) {
            axfyVar = axfy.a;
        }
        if ((axfyVar.b & 2) == 0) {
            return axgdVar;
        }
        axfy axfyVar2 = axgdVar.e;
        if (axfyVar2 == null) {
            axfyVar2 = axfy.a;
        }
        aihf builder = axfyVar2.toBuilder();
        aihf builder2 = axgdVar.toBuilder();
        String strConcat = ((axfy) builder.instance).d;
        Long lT = aedi.t(strConcat);
        lT.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        long jLongValue = lT.longValue();
        if (!concurrentHashMap.containsKey(lT)) {
            int i2 = i - 1;
            if (i2 == 0) {
                Matcher matcher = c.matcher(strConcat);
                if (matcher.matches()) {
                    strConcat = strConcat.startsWith("*sync*/") ? "*sync*/".concat(String.valueOf(a(strConcat.substring(7)))) : matcher.group(1);
                }
            } else if (i2 == 1) {
                strConcat = a(strConcat);
            } else if (i2 == 2) {
                strConcat = "--";
            }
            Long lT2 = aedi.t(strConcat);
            if (lT2 != null) {
                concurrentHashMap.putIfAbsent(lT, lT2);
            }
        }
        builder.copyOnWrite();
        axfy axfyVar3 = (axfy) builder.instance;
        axfyVar3.b |= 1;
        axfyVar3.c = jLongValue;
        builder.copyOnWrite();
        axfy axfyVar4 = (axfy) builder.instance;
        axfyVar4.b &= -3;
        axfyVar4.d = axfy.a.d;
        builder2.copyOnWrite();
        axgd axgdVar2 = (axgd) builder2.instance;
        axfy axfyVar5 = (axfy) builder.build();
        axfyVar5.getClass();
        axgdVar2.e = axfyVar5;
        axgdVar2.b |= 4;
        return (axgd) builder2.build();
    }
}
