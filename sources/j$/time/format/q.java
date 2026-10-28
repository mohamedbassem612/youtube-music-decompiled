package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class q {
    public static final j$.desugar.sun.nio.fs.o f = new j$.desugar.sun.nio.fs.o((byte) 2);
    public q a;
    public final q b;
    public final ArrayList c;
    public final boolean d;
    public int e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public q() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.a(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        b(dVar);
    }

    public final int b(e eVar) {
        Objects.a(eVar, "pp");
        q qVar = this.a;
        qVar.getClass();
        qVar.c.add(eVar);
        q qVar2 = this.a;
        qVar2.e = -1;
        return qVar2.c.size() - 1;
    }

    public final void c(char c) {
        b(new c(c));
    }

    public final void d(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new c(str.charAt(0)));
        } else {
            b(new m(str));
        }
    }

    public final void e(j$.time.temporal.a aVar, HashMap map) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        b(new n(aVar, textStyle, new a(new j$.nio.file.y(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void f(h hVar) {
        h hVarB;
        q qVar = this.a;
        int i = qVar.e;
        if (i < 0) {
            qVar.e = b(hVar);
            return;
        }
        h hVar2 = (h) qVar.c.get(i);
        byte b = hVar.b;
        byte b2 = hVar.c;
        if (b == b2 && hVar.d == y.NOT_NEGATIVE) {
            hVarB = hVar2.c(b2);
            b(hVar.b());
            this.a.e = i;
        } else {
            hVarB = hVar2.b();
            this.a.e = b(hVar);
        }
        this.a.c.set(i, hVarB);
    }

    public final void g(j$.time.temporal.n nVar, int i) {
        Objects.a(nVar, "field");
        if (i < 1 || i > 19) {
            j$.time.g.f("The width must be from 1 to 19 inclusive but was ", i);
        } else {
            f(new h(nVar, i, i, y.NOT_NEGATIVE));
        }
    }

    public final void h(j$.time.temporal.n nVar, int i, int i2, y yVar) {
        if (i == i2 && yVar == y.NOT_NEGATIVE) {
            g(nVar, i2);
            return;
        }
        Objects.a(nVar, "field");
        Objects.a(yVar, "signStyle");
        if (i < 1 || i > 19) {
            j$.time.g.f("The minimum width must be from 1 to 19 inclusive but was ", i);
            return;
        }
        if (i2 < 1 || i2 > 19) {
            j$.time.g.f("The maximum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i2 >= i) {
            f(new h(nVar, i, i2, yVar));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public final void i() {
        q qVar = this.a;
        if (qVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = qVar.c.size();
        q qVar2 = this.a;
        if (size <= 0) {
            this.a = qVar2.b;
            return;
        }
        d dVar = new d(qVar2.c, qVar2.d);
        this.a = this.a.b;
        b(dVar);
    }

    public final void j() {
        q qVar = this.a;
        qVar.e = -1;
        this.a = new q(qVar);
    }

    public final DateTimeFormatter k(x xVar, j$.time.chrono.s sVar) {
        return l(Locale.getDefault(), xVar, sVar);
    }

    public final DateTimeFormatter l(Locale locale, x xVar, j$.time.chrono.s sVar) {
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        d dVar = new d(this.c, false);
        int i = v.a;
        return new DateTimeFormatter(dVar, locale, xVar, sVar);
    }

    public q(q qVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = qVar;
        this.d = true;
    }
}
