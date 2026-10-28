package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yas implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public yas(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0282 A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02c7 A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d0 A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0212 A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0222 A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0242  */
    /* JADX WARN: Code duplicated, block: B:93:0x024e A[Catch: all -> 0x0325, TryCatch #4 {all -> 0x0325, blocks: (B:71:0x01da, B:75:0x01f6, B:78:0x0212, B:80:0x0222, B:82:0x022a, B:84:0x022e, B:86:0x023c, B:90:0x0243, B:91:0x0246, B:93:0x024e, B:97:0x025b, B:99:0x025f, B:101:0x0267, B:102:0x026a, B:103:0x027c, B:105:0x0282, B:106:0x02bb, B:116:0x02f2, B:118:0x02fb, B:119:0x0319, B:107:0x02c7, B:109:0x02d0, B:112:0x02e1, B:113:0x02e7), top: B:235:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:96:0x025a  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zF;
        spj spjVar;
        boolean z;
        spi spiVar;
        boolean z2;
        int i;
        abhv abhvVar;
        boolean z3;
        wgs[] wgsVarArr;
        yfq yfqVarH;
        String str;
        int i2;
        long j;
        yfq yfqVar;
        awmd awmdVar;
        elr elrVarB;
        Set setC;
        String strB;
        yfq yfqVar2;
        Set setC2;
        String strB2;
        elr elrVarA;
        yfq yfqVar3 = null;
        switch (this.$cid) {
            case 0:
                yat yatVar = (yat) this.a;
                ycs ycsVar = yatVar.e;
                if (ycsVar != null) {
                    agrx agrxVar = agso.a;
                    ycsVar.d();
                    yatVar.a(3);
                    return;
                }
                return;
            case 1:
                ((yar) this.a).r();
                return;
            case 2:
                ycn ycnVar = (ycn) this.a;
                ycnVar.a();
                ycnVar.b();
                return;
            case 3:
                ((zdx) this.a).ai();
                return;
            case 4:
                ((zdx) this.a).ao();
                return;
            case 5:
                ((zdx) this.a).ad();
                return;
            case 6:
                ((zfo) this.a).c();
                return;
            case 7:
                ((zkl) this.a).t();
                return;
            case 8:
                ((zkl) this.a).r();
                return;
            case 9:
                ((aacd) this.a).e();
                return;
            case 10:
                Object obj = this.a;
                aadk aadkVar = (aadk) obj;
                aado aadoVar = aadkVar.w;
                if (aadoVar.C()) {
                    mbc mbcVar = aadkVar.c;
                    long jB = mbcVar.b();
                    if (aadkVar.u == 0 || jB - aadkVar.u >= aadk.b) {
                        aadkVar.u = jB;
                        aaqg aaqgVar = (aaqg) aadkVar.e.io();
                        String str2 = aadkVar.d;
                        long jP = aaqgVar.p(str2);
                        if (jP <= 0) {
                            aadh aadhVar = new aadh(aadkVar);
                            if (aadoVar.C()) {
                                aadkVar.h.execute(afwl.i(new wdd(obj, aadhVar, 13, (byte[]) null)));
                                return;
                            }
                            return;
                        }
                        aoej aoejVar = aadkVar.v.c().l;
                        if (aoejVar == null) {
                            aoejVar = aoej.a;
                        }
                        if (aoejVar.e) {
                            return;
                        }
                        Cursor cursorRawQuery = ((aaew) aadkVar.i.io()).e.p().rawQuery("SELECT min(saved_timestamp) FROM playlistsV13", null);
                        try {
                            long j2 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : Long.MAX_VALUE;
                            cursorRawQuery.close();
                            if (mbcVar.f().toEpochMilli() > j2 + TimeUnit.SECONDS.toMillis(jP)) {
                                ((aari) aadkVar.f.io()).e(str2);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 11:
                aadv aadvVar = (aadv) this.a;
                if (aadvVar.k.C()) {
                    mbc mbcVar2 = aadvVar.c;
                    long jB2 = mbcVar2.b();
                    long j3 = aadvVar.b;
                    if (j3 == 0 || jB2 - j3 >= aadv.l) {
                        aadvVar.b = jB2;
                        aaqg aaqgVar2 = (aaqg) aadvVar.e.io();
                        String str3 = aadvVar.d;
                        long jQ = aaqgVar2.q(str3);
                        if (jQ > 0) {
                            Cursor cursorRawQuery2 = ((aaew) aadvVar.g.io()).j.aa().rawQuery("SELECT max(last_refresh_timestamp) FROM videosV2", null);
                            try {
                                long j4 = cursorRawQuery2.moveToFirst() ? cursorRawQuery2.getLong(0) : -1L;
                                if (cursorRawQuery2 != null) {
                                    cursorRawQuery2.close();
                                }
                                if (mbcVar2.f().toEpochMilli() > (j4 >= 0 ? j4 + TimeUnit.SECONDS.toMillis(jQ) : Long.MAX_VALUE)) {
                                    ((aaps) aadvVar.f.io()).c(str3);
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                if (cursorRawQuery2 == null) {
                                    throw th2;
                                }
                                try {
                                    cursorRawQuery2.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                Object obj2 = this.a;
                aagg aaggVar = (aagg) obj2;
                aaggVar.f.close();
                try {
                    if (((aagg) obj2).i != null) {
                        List listI = ((aagg) obj2).c.i();
                        for (aagl aaglVar : ((aagg) obj2).i.a()) {
                            if (aaglVar.b() == aamg.COMPLETE) {
                                ((aagg) obj2).u(aaglVar, listI);
                            }
                        }
                        Iterator it = ((aagg) obj2).g.iterator();
                        while (it.hasNext()) {
                            ((aado) ((hzo) it.next()).a).y(new aahi());
                            break;
                        }
                    }
                    return;
                } finally {
                    aaggVar.f.open();
                }
            case 13:
                ((aann) this.a).b();
                return;
            case 14:
                abes abesVar = (abes) this.a;
                if (abesVar.o && abesVar.p) {
                    abesVar.p = false;
                    abesVar.u.e(false, true);
                }
                abesVar.e();
                return;
            case 15:
                sog sogVar = ((abes) this.a).v.e;
                if (sogVar != null) {
                    sogVar.s();
                    return;
                }
                return;
            case 16:
                Object obj3 = this.a;
                try {
                    abfx abfxVar = ((abfy) obj3).g;
                    abfxVar.getClass().getSimpleName();
                    boolean zF2 = abfxVar.f();
                    if (!((abfy) obj3).f(1)) {
                        if (zF2) {
                            zF2 = true;
                            ((abfy) obj3).c();
                            boolean zF3 = ((abfy) obj3).f(4);
                            zF = ((abfy) obj3).f(2);
                            if (zF2) {
                                if (((abfy) obj3).g()) {
                                    ((abfy) obj3).a(8);
                                    if (((abfy) obj3).c > 0) {
                                        ((abfy) obj3).e(16);
                                    }
                                    ((abfy) obj3).e(4);
                                }
                                if (((abfy) obj3).f(1)) {
                                    ((abfy) obj3).f.h(((abfy) obj3).f(8), ((abfy) obj3).f(16));
                                    ((abfy) obj3).a(28);
                                }
                                ((abfy) obj3).a(4);
                            } else if (zF) {
                                ((FrameLayout) ((abfy) obj3).d).getWidth();
                                if (abfxVar.e(2)) {
                                    spjVar = abfxVar.f;
                                    z = abfxVar.h;
                                    if (spjVar.d) {
                                        spjVar.e = z;
                                        syn synVar = (syn) spjVar.b;
                                        soz sozVar = (soz) spjVar.a;
                                        int i3 = sozVar.d;
                                        if (z) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        synVar.h(i3, z3);
                                    }
                                    spiVar = abfxVar.a;
                                    z2 = abfxVar.h;
                                    if (spiVar.e != z2) {
                                        spiVar.e = z2;
                                        if (true != spiVar.e(spiVar.f, z2)) {
                                            i = 8;
                                        } else {
                                            i = 0;
                                        }
                                        abhvVar = spiVar.g;
                                        if (abhvVar != null) {
                                            abhvVar.a(i);
                                        }
                                    }
                                    ((Boolean) abfxVar.b.a).booleanValue();
                                    ((Boolean) abfxVar.c.a).booleanValue();
                                }
                                if (abfxVar.e(1)) {
                                    boolean zF4 = abfxVar.f();
                                    abfxVar.e.d(abfxVar.g.e, zF4);
                                    abfxVar.a.d(abfxVar.g.f, zF4);
                                    abfxVar.b.d(Boolean.valueOf(abfxVar.g.b), zF4);
                                    abfxVar.c.d(Boolean.valueOf(abfxVar.g.c), zF4);
                                    abfxVar.f.d(abfxVar.g.d, zF4);
                                }
                                ((abfy) obj3).a(2);
                                ((abfy) obj3).e = 0;
                            }
                            if (zF2) {
                                if (((abfy) obj3).f(1)) {
                                    ((abfy) obj3).f.h(((abfy) obj3).f(8), ((abfy) obj3).f(16));
                                    ((abfy) obj3).a(28);
                                }
                                ((abfy) obj3).a(4);
                            }
                        }
                        break;
                    } else {
                        ((abfy) obj3).c();
                        boolean zF5 = ((abfy) obj3).f(4);
                        zF = ((abfy) obj3).f(2);
                        if (zF2) {
                            if (((abfy) obj3).g()) {
                                ((abfy) obj3).a(8);
                                if (((abfy) obj3).c > 0 && !zF5) {
                                    ((abfy) obj3).e(16);
                                }
                                ((abfy) obj3).e(4);
                            }
                            if (((abfy) obj3).f(1)) {
                                ((abfy) obj3).f.h(((abfy) obj3).f(8), ((abfy) obj3).f(16));
                                ((abfy) obj3).a(28);
                            }
                            ((abfy) obj3).a(4);
                        } else if (zF) {
                            ((FrameLayout) ((abfy) obj3).d).getWidth();
                            if (abfxVar.e(2)) {
                                spjVar = abfxVar.f;
                                z = abfxVar.h;
                                if (spjVar.d && spjVar.e != z) {
                                    spjVar.e = z;
                                    syn synVar2 = (syn) spjVar.b;
                                    soz sozVar2 = (soz) spjVar.a;
                                    int i4 = sozVar2.d;
                                    if (z || sozVar2.e) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    synVar2.h(i4, z3);
                                }
                                spiVar = abfxVar.a;
                                z2 = abfxVar.h;
                                if (spiVar.e != z2) {
                                    spiVar.e = z2;
                                    if (true != spiVar.e(spiVar.f, z2)) {
                                        i = 8;
                                    } else {
                                        i = 0;
                                    }
                                    abhvVar = spiVar.g;
                                    if (abhvVar != null && ((sow) spiVar.a).a) {
                                        abhvVar.a(i);
                                    }
                                }
                                ((Boolean) abfxVar.b.a).booleanValue();
                                ((Boolean) abfxVar.c.a).booleanValue();
                            }
                            if (abfxVar.e(1)) {
                                boolean zF6 = abfxVar.f();
                                abfxVar.e.d(abfxVar.g.e, zF6);
                                abfxVar.a.d(abfxVar.g.f, zF6);
                                abfxVar.b.d(Boolean.valueOf(abfxVar.g.b), zF6);
                                abfxVar.c.d(Boolean.valueOf(abfxVar.g.c), zF6);
                                abfxVar.f.d(abfxVar.g.d, zF6);
                            }
                            ((abfy) obj3).a(2);
                            ((abfy) obj3).e = 0;
                        }
                        if (zF2 && zF5) {
                            if (((abfy) obj3).f(1)) {
                                ((abfy) obj3).f.h(((abfy) obj3).f(8), ((abfy) obj3).f(16));
                                ((abfy) obj3).a(28);
                            }
                            ((abfy) obj3).a(4);
                        }
                        break;
                    }
                    return;
                } finally {
                    ((abfy) obj3).a(32);
                }
            case 17:
                abga abgaVar = (abga) this.a;
                abge abgeVar = abgaVar.c;
                synchronized (abgeVar.R) {
                    wgsVarArr = abgeVar.S;
                    break;
                }
                if (wgsVarArr == null) {
                    abgaVar.a();
                    return;
                }
                int i5 = 0;
                long j5 = -1;
                while (i5 < wgsVarArr.length) {
                    wgs wgsVar = wgsVarArr[i5];
                    abge abgeVar2 = abgaVar.c;
                    long micros = TimeUnit.MILLISECONDS.toMicros(abgeVar2.M);
                    boolean zAc = wgsVar.ac();
                    yha yhaVar = abgeVar2.V;
                    if (zAc) {
                        String str4 = wgsVar.c;
                        if (TextUtils.isEmpty(str4)) {
                            yfqVar2 = new yfq(micros, -1L, -1L, -1L);
                        } else {
                            String str5 = wgsVar.f;
                            typ.f(str4);
                            typ.f(str5);
                            if (yhaVar.b.io() == null || (strB2 = yhaVar.b((setC2 = yhaVar.c()), str4, str5)) == null || (elrVarA = yhaVar.g.A(setC2, strB2, false)) == null) {
                                yfqVar2 = new yfq(micros, -1L, -1L, -1L);
                            } else {
                                yfqVarH = yhaVar.h(setC2, strB2, elrVarA, micros);
                            }
                        }
                        yfqVarH = yfqVar2;
                    } else {
                        yfqVarH = yfqVar3;
                    }
                    if (yfqVarH != null) {
                        micros = micros;
                        if (yfqVarH.c != -1) {
                            i2 = i5;
                            j = 0;
                        } else {
                            micros = micros;
                            str = wgsVar.c;
                            if (TextUtils.isEmpty(str)) {
                                i2 = i5;
                                j = 0;
                                yfqVar = new yfq(micros, -1L, -1L, -1L);
                            } else {
                                String str6 = wgsVar.f;
                                j = 0;
                                long j6 = wgsVar.j();
                                i2 = i5;
                                long micros2 = TimeUnit.MILLISECONDS.toMicros(wgsVar.d);
                                typ.f(str);
                                typ.f(str6);
                                awmdVar = yhaVar.b;
                                if (awmdVar.io() != null || (elrVarB = ((ygf) awmdVar.io()).b(j6, micros2)) == null || (strB = yhaVar.b((setC = yhaVar.c()), str, str6)) == null) {
                                    yfqVar = new yfq(micros, -1L, -1L, -1L);
                                } else {
                                    yfqVarH = yhaVar.h(setC, strB, elrVarB, micros);
                                }
                            }
                            yfqVarH = yfqVar;
                        }
                    } else {
                        micros = micros;
                        str = wgsVar.c;
                        if (TextUtils.isEmpty(str)) {
                            String str7 = wgsVar.f;
                            j = 0;
                            long j7 = wgsVar.j();
                            i2 = i5;
                            long micros3 = TimeUnit.MILLISECONDS.toMicros(wgsVar.d);
                            typ.f(str);
                            typ.f(str7);
                            awmdVar = yhaVar.b;
                            if (awmdVar.io() != null) {
                                yfqVar = new yfq(micros, -1L, -1L, -1L);
                            } else {
                                yfqVarH = yhaVar.h(setC, strB, elrVarB, micros);
                            }
                        } else {
                            i2 = i5;
                            j = 0;
                            yfqVar = new yfq(micros, -1L, -1L, -1L);
                        }
                        yfqVarH = yfqVar;
                    }
                    long jMin = yfqVarH.c;
                    if (jMin == Long.MAX_VALUE) {
                        jMin = TimeUnit.MILLISECONDS.toMicros(wgsVar.d);
                    }
                    if (j5 >= j) {
                        jMin = Math.min(j5, jMin);
                    }
                    j5 = jMin;
                    i5 = i2 + 1;
                    yfqVar3 = null;
                }
                abge abgeVar3 = abgaVar.c;
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                abgeVar3.Q = j5 / 1000;
                abgeVar3.A.execute(new abbj(abgeVar3, 8));
                if (abgeVar3.Q >= abgeVar3.O) {
                    abgaVar.a();
                    return;
                }
                return;
            case 18:
                abkk abkkVar = (abkk) this.a;
                abkkVar.d = false;
                abkkVar.b.b();
                return;
            case 19:
                abtr abtrVar = (abtr) this.a;
                xir xirVar = (xir) abtrVar.d.io();
                abtt abttVar = abtt.AUTOPLAY;
                abno abnoVarA = abnp.a();
                abnoVarA.a = xirVar;
                ((aavo) abtrVar.c.io()).i(new abtu(abttVar, null, abnoVarA.a(), null));
                return;
            default:
                abtr abtrVar2 = (abtr) this.a;
                xir xirVar2 = (xir) abtrVar2.e.io();
                abtt abttVar2 = abtt.AUTONAV;
                abno abnoVarA2 = abnp.a();
                abnoVarA2.a = xirVar2;
                ((aavo) abtrVar2.c.io()).i(new abtu(abttVar2, null, abnoVarA2.a(), null));
                return;
        }
    }

    public /* synthetic */ yas(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
