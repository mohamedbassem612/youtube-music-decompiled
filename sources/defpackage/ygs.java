package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.Key;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygs implements Runnable {
    public final long a;
    public final yfh b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public yhi f;
    public final elq g;
    private final jsk h;
    private final Key i;
    private final zjr j;
    private final Map k;
    private final ygp l;
    private final String m;
    private final ywn n;

    public ygs(jsk jskVar, Key key, zjr zjrVar, yfh yfhVar, ygp ygpVar, long j, boolean z, boolean z2, abxv abxvVar, Map map, ywn ywnVar) {
        this.h = jskVar;
        this.i = key;
        this.g = new elq(abxvVar);
        this.j = zjrVar;
        this.k = map;
        this.b = yfhVar;
        this.l = ygpVar;
        this.a = j;
        this.c = z;
        this.d = z2;
        this.e = yfhVar.c == 0;
        this.m = yfhVar.t();
        this.n = ywnVar;
    }

    public static zhv a() {
        zhv zhvVar = new zhv("cache.exception");
        zhvVar.f("op", "write");
        zhvVar.d();
        return zhvVar;
    }

    private final void b(zhz zhzVar, boolean z) {
        if (!z || this.j.j.m(115, 45414929L)) {
            this.n.k(zhzVar);
        }
    }

    private final void c(Exception exc, String str) {
        zhv zhvVarA = a();
        zhvVarA.d = exc;
        zhvVarA.f("c", str);
        zhvVarA.f("writerKey", this.b.toString());
        zhvVarA.f("streamOffset", String.valueOf(this.a));
        zhvVarA.f("start", String.valueOf(this.c));
        zhvVarA.f("end", String.valueOf(this.d));
        b(zhvVarA.a(), false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d7 A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02e4 A[Catch: yfe -> 0x0525, yfd -> 0x0528, Exception -> 0x0532, all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02e8 A[Catch: yfe -> 0x0525, yfd -> 0x0528, Exception -> 0x0532, all -> 0x05f2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0301 A[Catch: yfe -> 0x0525, yfd -> 0x0528, Exception -> 0x0532, all -> 0x05f2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0349 A[Catch: Exception -> 0x0450, yfe -> 0x045c, yfd -> 0x045e, all -> 0x05f2, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x05f2, blocks: (B:104:0x02e8, B:112:0x0301, B:115:0x0349, B:121:0x035f, B:123:0x036e, B:125:0x0374, B:127:0x037c, B:128:0x039a, B:129:0x039b, B:130:0x03a2, B:238:0x05c8, B:78:0x0291), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0351 A[Catch: Exception -> 0x0450, yfe -> 0x045c, yfd -> 0x045e, all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x036e A[Catch: InterruptedException -> 0x043d, Exception -> 0x0450, yfe -> 0x045c, yfd -> 0x045e, all -> 0x05f2, TryCatch #6 {all -> 0x05f2, blocks: (B:104:0x02e8, B:112:0x0301, B:115:0x0349, B:121:0x035f, B:123:0x036e, B:125:0x0374, B:127:0x037c, B:128:0x039a, B:129:0x039b, B:130:0x03a2, B:238:0x05c8, B:78:0x0291), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0374 A[Catch: InterruptedException -> 0x043d, Exception -> 0x0450, yfe -> 0x045c, yfd -> 0x045e, all -> 0x05f2, TryCatch #6 {all -> 0x05f2, blocks: (B:104:0x02e8, B:112:0x0301, B:115:0x0349, B:121:0x035f, B:123:0x036e, B:125:0x0374, B:127:0x037c, B:128:0x039a, B:129:0x039b, B:130:0x03a2, B:238:0x05c8, B:78:0x0291), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x03b4 A[Catch: InterruptedException -> 0x043b, Exception -> 0x044a, yfe -> 0x044c, yfd -> 0x044e, all -> 0x05f5, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03bd A[Catch: InterruptedException -> 0x043b, Exception -> 0x044a, yfe -> 0x044c, yfd -> 0x044e, all -> 0x05f5, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x03c7 A[Catch: InterruptedException -> 0x043b, Exception -> 0x044a, yfe -> 0x044c, yfd -> 0x044e, all -> 0x05f5, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x03e4 A[Catch: Exception -> 0x044a, yfe -> 0x044c, yfd -> 0x044e, all -> 0x05f5, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0401 A[Catch: InterruptedException -> 0x043b, Exception -> 0x044a, yfe -> 0x044c, yfd -> 0x044e, all -> 0x05f5, TRY_ENTER, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x040e A[Catch: InterruptedException -> 0x043b, Exception -> 0x044a, yfe -> 0x044c, yfd -> 0x044e, all -> 0x05f5, TryCatch #8 {all -> 0x05f5, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:106:0x02f1, B:110:0x02fa, B:113:0x033f, B:131:0x03a3, B:133:0x03ae, B:135:0x03b4, B:138:0x03c7, B:140:0x03cd, B:141:0x03cf, B:143:0x03e4, B:144:0x03f3, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:193:0x04ad, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:146:0x0401, B:148:0x040e, B:150:0x041c, B:151:0x043a, B:149:0x0413, B:136:0x03bd, B:156:0x0442, B:157:0x0449, B:166:0x0455, B:167:0x045b, B:236:0x05a8, B:226:0x055e, B:172:0x0463, B:173:0x0466, B:117:0x0351, B:62:0x0245, B:64:0x0249, B:67:0x025b), top: B:278:0x0217 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0467  */
    /* JADX WARN: Code duplicated, block: B:178:0x0470 A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_ENTER, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0474 A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x047c A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0488 A[Catch: yfd -> 0x0521, Exception -> 0x0532, yfe -> 0x055e, all -> 0x05f5, TRY_ENTER, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0491  */
    /* JADX WARN: Code duplicated, block: B:187:0x0493  */
    /* JADX WARN: Code duplicated, block: B:190:0x049b A[Catch: yfd -> 0x0521, Exception -> 0x0532, yfe -> 0x055e, all -> 0x05f5, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:192:0x04a5 A[Catch: yfd -> 0x0521, Exception -> 0x0532, yfe -> 0x055e, all -> 0x05f5, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:196:0x04c0 A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x04c8 A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x04e0 A[Catch: yfd -> 0x0521, Exception -> 0x0532, yfe -> 0x055e, all -> 0x05f5, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0513 A[Catch: yfd -> 0x0521, Exception -> 0x0532, yfe -> 0x055e, all -> 0x05f5, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:230:0x058b A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x059d A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x05d3 A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05e5 A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x05ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x0601  */
    /* JADX WARN: Code duplicated, block: B:261:0x0609 A[Catch: Exception -> 0x0621, all -> 0x0632, TryCatch #12 {Exception -> 0x0621, blocks: (B:255:0x05fb, B:259:0x0602, B:261:0x0609, B:263:0x0619), top: B:284:0x05fb, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0619 A[Catch: Exception -> 0x0621, all -> 0x0632, TRY_LEAVE, TryCatch #12 {Exception -> 0x0621, blocks: (B:255:0x05fb, B:259:0x0602, B:261:0x0609, B:263:0x0619), top: B:284:0x05fb, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[Catch: all -> 0x0632, SYNTHETIC, TryCatch #7 {all -> 0x0632, blocks: (B:3:0x000a, B:6:0x0022, B:8:0x0026, B:44:0x01fb, B:46:0x0202, B:48:0x0217, B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:255:0x05fb, B:267:0x0625, B:259:0x0602, B:261:0x0609, B:263:0x0619, B:266:0x0622, B:248:0x05ee, B:216:0x0539, B:218:0x0540, B:219:0x054e, B:9:0x0055, B:12:0x005d, B:15:0x0063, B:16:0x0087, B:18:0x008b, B:20:0x0093, B:22:0x00c6, B:24:0x00cd, B:26:0x00d7, B:39:0x0174, B:43:0x01f6, B:27:0x0104, B:29:0x0120, B:30:0x0140, B:32:0x0144, B:34:0x014a, B:36:0x015d, B:38:0x0163, B:40:0x017d, B:41:0x01b6, B:269:0x0627), top: B:280:0x000a, inners: #1, #4, #12 }] */
    /* JADX WARN: Code duplicated, block: B:306:? A[Catch: all -> 0x0632, SYNTHETIC, TryCatch #7 {all -> 0x0632, blocks: (B:3:0x000a, B:6:0x0022, B:8:0x0026, B:44:0x01fb, B:46:0x0202, B:48:0x0217, B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:255:0x05fb, B:267:0x0625, B:259:0x0602, B:261:0x0609, B:263:0x0619, B:266:0x0622, B:248:0x05ee, B:216:0x0539, B:218:0x0540, B:219:0x054e, B:9:0x0055, B:12:0x005d, B:15:0x0063, B:16:0x0087, B:18:0x008b, B:20:0x0093, B:22:0x00c6, B:24:0x00cd, B:26:0x00d7, B:39:0x0174, B:43:0x01f6, B:27:0x0104, B:29:0x0120, B:30:0x0140, B:32:0x0144, B:34:0x014a, B:36:0x015d, B:38:0x0163, B:40:0x017d, B:41:0x01b6, B:269:0x0627), top: B:280:0x000a, inners: #1, #4, #12 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0202 A[Catch: RuntimeException -> 0x0626, all -> 0x0632, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x0626, blocks: (B:3:0x000a, B:6:0x0022, B:8:0x0026, B:44:0x01fb, B:46:0x0202, B:9:0x0055, B:12:0x005d, B:15:0x0063, B:16:0x0087, B:18:0x008b, B:20:0x0093, B:22:0x00c6, B:24:0x00cd, B:26:0x00d7, B:39:0x0174, B:43:0x01f6, B:27:0x0104, B:29:0x0120, B:30:0x0140, B:32:0x0144, B:34:0x014a, B:36:0x015d, B:38:0x0163, B:40:0x017d, B:41:0x01b6), top: B:280:0x000a, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0220 A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_ENTER, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0224 A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x022c A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x023d A[Catch: Exception -> 0x0532, yfe -> 0x055a, yfd -> 0x05a4, all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0245 A[Catch: yfd -> 0x052c, Exception -> 0x0532, yfe -> 0x055a, all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0249 A[Catch: Exception -> 0x0532, yfe -> 0x055a, yfd -> 0x05a4, all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x025b A[Catch: yfd -> 0x052c, Exception -> 0x0532, yfe -> 0x055a, all -> 0x05f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x026d A[Catch: all -> 0x02b1, yfe -> 0x02b6, yfd -> 0x052c, Exception -> 0x0532, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x029a A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x02aa A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c7 A[Catch: yfe -> 0x0525, yfd -> 0x0528, Exception -> 0x0532, all -> 0x05f5, TRY_LEAVE, TryCatch #2 {Exception -> 0x0532, blocks: (B:49:0x021b, B:58:0x0239, B:60:0x023d, B:92:0x02c3, B:94:0x02c7, B:102:0x02e4, B:104:0x02e8, B:106:0x02f1, B:110:0x02fa, B:112:0x0301, B:175:0x046b, B:184:0x0488, B:188:0x0494, B:190:0x049b, B:192:0x04a5, B:202:0x04d9, B:203:0x04df, B:204:0x04e0, B:205:0x0512, B:206:0x0513, B:207:0x0520, B:166:0x0455, B:167:0x045b, B:172:0x0463, B:173:0x0466, B:62:0x0245, B:64:0x0249, B:72:0x026d, B:74:0x0279, B:76:0x0289, B:78:0x0291, B:67:0x025b, B:70:0x0261), top: B:279:0x021b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02cb A[Catch: Exception -> 0x05ed, all -> 0x0632, TRY_ENTER, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02cf A[Catch: Exception -> 0x05ed, all -> 0x0632, TryCatch #1 {Exception -> 0x05ed, blocks: (B:52:0x0220, B:54:0x0224, B:56:0x022c, B:199:0x04d3, B:245:0x05e5, B:96:0x02cb, B:98:0x02cf, B:100:0x02d7, B:178:0x0470, B:180:0x0474, B:182:0x047c, B:194:0x04bc, B:196:0x04c0, B:198:0x04c8, B:240:0x05cc, B:242:0x05d3, B:243:0x05e1, B:228:0x0584, B:230:0x058b, B:231:0x0599, B:233:0x059d, B:80:0x0295, B:82:0x029a, B:84:0x02aa, B:216:0x0539, B:218:0x0540, B:219:0x054e), top: B:278:0x0217, outer: #7 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:204:0x04e0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [zhv] */
    /* JADX WARN: Type inference failed for: r0v27, types: [zhv] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [yfi] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ygq] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [yfi] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ?? r11;
        String str7;
        String str8;
        String str9;
        String str10;
        ?? r15;
        ?? r12;
        String str11;
        String str12;
        ?? C;
        boolean z;
        ?? r16;
        ?? r17;
        boolean z2;
        ?? r2;
        Throwable th;
        boolean z3;
        ?? r13;
        ?? r3;
        ?? r10;
        String str13;
        yfh yfhVar;
        ?? r19;
        boolean z4;
        boolean z5;
        long j;
        yfh yfhVar2;
        String str14;
        String str15;
        int i;
        ygp ygpVar;
        long j2;
        boolean z6;
        AtomicLong atomicLong;
        elq elqVar;
        String str16;
        agqj agqjVar;
        long jA;
        long j3;
        boolean z7;
        zjr zjrVar;
        long j4;
        int i2;
        tqj tqjVar;
        jsk jskVar;
        jsp jspVarC;
        byh byhVar;
        tqj tqjVar2;
        String str17;
        String str18;
        String str19;
        String str20;
        yhi yhiVar;
        long j5;
        String str21;
        long j6;
        String str22;
        yev yevVar;
        try {
            try {
                Map map = this.k;
                yfh yfhVar3 = this.b;
                yfi yfiVarE = (yfi) map.get(yfhVar3);
                ?? r18 = -1;
                String str23 = "streamOffset";
                String str24 = "c";
                String str25 = "writerKey";
                if (yfiVarE == null) {
                    if (this.c) {
                        if (!this.e) {
                            String str26 = "alreadyCached";
                            str3 = "dataLength";
                            str17 = "streamOffset";
                            str18 = "c";
                            String str27 = "writerKey";
                            elq elqVar2 = this.g;
                            String str28 = this.m;
                            String str29 = "seqNum";
                            jsk jskVar2 = this.h;
                            agqj agqjVar2 = new agqj(jskVar2);
                            elq elqVarF = elqVar2.F(str28, agqjVar2);
                            if (elqVarF == null) {
                                zhv zhvVarA = a();
                                zhvVarA.f("missingSabrSegmentMap", str28);
                                str2 = "m";
                                C = new yev(new yey(zhvVarA.a(), false));
                                str4 = str17;
                                str5 = str18;
                                str12 = str28;
                                str11 = str29;
                                r12 = agqjVar2;
                                str10 = str26;
                                str9 = str27;
                            } else {
                                int i3 = yfhVar3.c;
                                if (i3 <= 0 || i3 > elqVarF.p()) {
                                    str2 = "m";
                                    str4 = str17;
                                    str5 = str18;
                                    zhv zhvVarA2 = a();
                                    zhvVarA2.f(str5, "invalidSeqNum");
                                    zhvVarA2.f("key", str28);
                                    zhvVarA2.f(str29, String.valueOf(i3));
                                    zhvVarA2.f("maxSeqNum", String.valueOf(elqVarF.p()));
                                    C = new yev(new yey(zhvVarA2.a(), false));
                                    str12 = str28;
                                    str11 = str29;
                                    r12 = i3;
                                    str10 = str26;
                                    str9 = str27;
                                } else {
                                    long jS = elqVarF.s(i3);
                                    str2 = "m";
                                    long jQ = elqVarF.q(i3);
                                    long j7 = this.a;
                                    if (j7 < jS || j7 >= jS + jQ) {
                                        zhv zhvVarA3 = a();
                                        str5 = str18;
                                        zhvVarA3.f(str5, "invalidStreamStartOffset");
                                        zhvVarA3.f("key", str28);
                                        zhvVarA3.f("segOffset", String.valueOf(jS));
                                        str4 = str17;
                                        zhvVarA3.f(str4, String.valueOf(j7));
                                        zhvVarA3.f("segSize", String.valueOf(jQ));
                                        C = new yev(new yey(zhvVarA3.a(), false));
                                        str12 = jS;
                                        str11 = str29;
                                        r12 = i3;
                                        r15 = jQ;
                                        str10 = str26;
                                        str9 = str27;
                                    } else {
                                        Key key = this.i;
                                        zjr zjrVar2 = this.j;
                                        long j8 = jQ;
                                        yhi yhiVar2 = this.f;
                                        yfiVarE = yfi.e(jskVar2, key, yfhVar3, jS, j8, zjrVar2, null, yhiVar2, this.n);
                                        j6 = jS;
                                        str21 = str29;
                                        j5 = j8;
                                        yhiVar = yhiVar2;
                                        str20 = str26;
                                        str19 = str27;
                                    }
                                }
                            }
                            if (C.b() == 2) {
                                b(((yey) C.a()).a, ((yey) C.a()).b);
                            } else {
                                try {
                                    try {
                                        try {
                                            C = C.c();
                                            try {
                                                try {
                                                    try {
                                                        if (C.m != 3) {
                                                            try {
                                                                z4 = this.d;
                                                                try {
                                                                    if (z4 || this.l.a() != 0) {
                                                                        z5 = this.e;
                                                                        if (!z5) {
                                                                            j = C.f;
                                                                            if (j != -1) {
                                                                                try {
                                                                                    try {
                                                                                        if (this.h.o(C.c, C.d, j)) {
                                                                                            zhv zhvVarA4 = a();
                                                                                            yfhVar2 = this.b;
                                                                                            str12 = str9;
                                                                                            zhvVarA4.f(str12, yfhVar2.toString());
                                                                                            zhvVarA4.f(str4, String.valueOf(this.a));
                                                                                            zhvVarA4.f(str2, str10);
                                                                                            b(zhvVarA4.a(), true);
                                                                                            C.b(false);
                                                                                            if (z5) {
                                                                                                this.g.F(this.m, new agqj(this.h));
                                                                                            }
                                                                                            if (z4) {
                                                                                                this.k.remove(yfhVar2);
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        r15 = 1;
                                                                                        z = false;
                                                                                        r3 = C;
                                                                                        r16 = r15;
                                                                                        z2 = z;
                                                                                        r2 = r3;
                                                                                        r17 = r16;
                                                                                        th = th;
                                                                                        try {
                                                                                            z3 = this.d;
                                                                                            r13 = z2;
                                                                                            if (!z3) {
                                                                                                if (!z2) {
                                                                                                    throw th;
                                                                                                }
                                                                                                r13 = r17;
                                                                                            }
                                                                                            r2.b(r13);
                                                                                            if (this.e) {
                                                                                                this.g.F(this.m, new agqj(this.h));
                                                                                            }
                                                                                            if (!z3) {
                                                                                                throw th;
                                                                                            }
                                                                                            this.k.remove(this.b);
                                                                                            throw th;
                                                                                        } catch (Exception e) {
                                                                                            c(e, "endWritingSegment");
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                } catch (yfe unused) {
                                                                                    str12 = str9;
                                                                                    r18 = str2;
                                                                                    ?? A = a();
                                                                                    yfhVar = this.b;
                                                                                    A.f(str12, yfhVar.toString());
                                                                                    A.f(str4, String.valueOf(this.a));
                                                                                    A.f(r18, "cacheUninitialized");
                                                                                    b(A.a(), true);
                                                                                    C.b(false);
                                                                                    if (this.e) {
                                                                                        this.g.F(this.m, new agqj(this.h));
                                                                                    }
                                                                                    if (this.d) {
                                                                                        this.k.remove(yfhVar);
                                                                                    }
                                                                                    this.l.b();
                                                                                }
                                                                            }
                                                                            str14 = str10;
                                                                            str15 = str2;
                                                                            str12 = str9;
                                                                            i = 1;
                                                                            if (this.c) {
                                                                                if (C.m == 1) {
                                                                                    if (this.d) {
                                                                                    }
                                                                                    j3 = this.a;
                                                                                    if (C.m == 1) {
                                                                                        z7 = true;
                                                                                    } else {
                                                                                        z7 = false;
                                                                                    }
                                                                                    zkf.c(z7);
                                                                                    if (C.l != null) {
                                                                                        ywn ywnVar = C.h;
                                                                                        zhv zhvVarA5 = a();
                                                                                        zhvVarA5.f(str5, "notReleased");
                                                                                        zhvVarA5.f("streamKey", C.c);
                                                                                        zhvVarA5.f("segmentOffset", String.valueOf(C.d));
                                                                                        zhvVarA5.f("dataStartOffset", String.valueOf(j3));
                                                                                        zhvVarA5.f(str3, String.valueOf(jA));
                                                                                        ywnVar.k(zhvVarA5.a());
                                                                                        C.c();
                                                                                        C.d();
                                                                                    }
                                                                                    C.e = j3;
                                                                                    zjrVar = C.g;
                                                                                    if (zjrVar.bF()) {
                                                                                        C.j.set(j3);
                                                                                        j4 = jA;
                                                                                    } else {
                                                                                        j3 = C.d;
                                                                                        j4 = C.f;
                                                                                        C.j.set(j3);
                                                                                    }
                                                                                    i2 = 0;
                                                                                    while (true) {
                                                                                        if (i2 > i) {
                                                                                            tqjVar = C.g.v;
                                                                                            int i4 = tqr.a;
                                                                                            if (tqjVar.k(1073830473)) {
                                                                                                jskVar = C.a;
                                                                                                if (jskVar instanceof ygu) {
                                                                                                    throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                                                                }
                                                                                            }
                                                                                            throw new IOException("Unable to obtain writelock.");
                                                                                        }
                                                                                        String str30 = str15;
                                                                                        String str31 = str14;
                                                                                        if (zjrVar.j.m(121, 45421225L)) {
                                                                                            jspVarC = C.a.b(C.c, j3);
                                                                                        } else {
                                                                                            jspVarC = C.a.c(C.c, j3);
                                                                                        }
                                                                                        if (jspVarC != null) {
                                                                                            if (jspVarC.b()) {
                                                                                                C.l = jspVarC;
                                                                                                byhVar = new byh();
                                                                                                byhVar.a = Uri.EMPTY;
                                                                                                byhVar.i = C.c;
                                                                                                byhVar.h = j4;
                                                                                                byhVar.b = j3;
                                                                                                if (C.i) {
                                                                                                    ypp yppVarA = ypq.a();
                                                                                                    yppVarA.i(C.h);
                                                                                                    byhVar.k = yppVarA.a();
                                                                                                }
                                                                                                C.b.b(byhVar.a());
                                                                                                C.m = 2;
                                                                                                break;
                                                                                            }
                                                                                            tqjVar2 = zjrVar.v;
                                                                                            int i5 = tqr.a;
                                                                                            if (tqjVar2.k(1073830414)) {
                                                                                                throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                                                            }
                                                                                            C.a.l(jspVarC);
                                                                                        }
                                                                                        i2++;
                                                                                        str15 = str30;
                                                                                        str14 = str31;
                                                                                        i = 1;
                                                                                    }
                                                                                } else if (this.d) {
                                                                                    C.b(false);
                                                                                    if (this.e) {
                                                                                        elqVar = this.g;
                                                                                        str16 = this.m;
                                                                                        agqjVar = new agqj(this.h);
                                                                                        elqVar.F(str16, agqjVar);
                                                                                    }
                                                                                    this.k.remove(this.b);
                                                                                }
                                                                            }
                                                                            if (C.m == 2) {
                                                                                ygpVar = this.l;
                                                                                j2 = this.a;
                                                                                if (C.m == 2) {
                                                                                    z6 = true;
                                                                                } else {
                                                                                    z6 = false;
                                                                                }
                                                                                zkf.c(z6);
                                                                                if (C.l == null) {
                                                                                    throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                                                                }
                                                                                atomicLong = C.j;
                                                                                if (j2 != atomicLong.get()) {
                                                                                    C.a();
                                                                                    C.c();
                                                                                    throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                                                                }
                                                                                byte[] bArrC = ygpVar.c();
                                                                                int iA = ygpVar.a();
                                                                                C.b.c(bArrC, 0, iA);
                                                                                long j9 = iA;
                                                                                atomicLong.addAndGet(j9);
                                                                                C.k.addAndGet(j9);
                                                                                if (this.d) {
                                                                                    C.b(false);
                                                                                    if (this.e) {
                                                                                        elqVar = this.g;
                                                                                        str16 = this.m;
                                                                                        agqjVar = new agqj(this.h);
                                                                                        elqVar.F(str16, agqjVar);
                                                                                    }
                                                                                    this.k.remove(this.b);
                                                                                }
                                                                            } else if (this.d) {
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    elqVar = this.g;
                                                                                    str16 = this.m;
                                                                                    agqjVar = new agqj(this.h);
                                                                                    elqVar.F(str16, agqjVar);
                                                                                }
                                                                                this.k.remove(this.b);
                                                                            }
                                                                        } else if (this.g.E(this.m, new agqj(this.h)) != null) {
                                                                            zhv zhvVarA6 = a();
                                                                            yfhVar2 = this.b;
                                                                            str12 = str9;
                                                                            try {
                                                                                zhvVarA6.f(str12, yfhVar2.toString());
                                                                                zhvVarA6.f(str4, String.valueOf(this.a));
                                                                                zhvVarA6.f(str2, str10);
                                                                                b(zhvVarA6.a(), true);
                                                                                C.b(false);
                                                                                if (z5) {
                                                                                    this.g.F(this.m, new agqj(this.h));
                                                                                }
                                                                                if (z4) {
                                                                                    this.k.remove(yfhVar2);
                                                                                }
                                                                            } catch (yfd unused2) {
                                                                                r10 = str2;
                                                                                str13 = str12;
                                                                                r19 = str10;
                                                                                ?? A2 = a();
                                                                                A2.f(str13, this.b.toString());
                                                                                A2.f(str4, String.valueOf(this.a));
                                                                                A2.f(r10, r19);
                                                                                b(A2.a(), true);
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    this.g.F(this.m, new agqj(this.h));
                                                                                }
                                                                                if (this.d) {
                                                                                    this.k.remove(this.b);
                                                                                }
                                                                            } catch (yfe unused3) {
                                                                                r18 = str2;
                                                                                ?? A3 = a();
                                                                                yfhVar = this.b;
                                                                                A3.f(str12, yfhVar.toString());
                                                                                A3.f(str4, String.valueOf(this.a));
                                                                                A3.f(r18, "cacheUninitialized");
                                                                                b(A3.a(), true);
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    this.g.F(this.m, new agqj(this.h));
                                                                                }
                                                                                if (this.d) {
                                                                                    this.k.remove(yfhVar);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str14 = str10;
                                                                            str15 = str2;
                                                                            str12 = str9;
                                                                            i = 1;
                                                                            try {
                                                                                if (this.c) {
                                                                                    if (C.m == 1) {
                                                                                        jA = this.d ? this.l.a() : -1L;
                                                                                        j3 = this.a;
                                                                                        if (C.m == 1) {
                                                                                            z7 = true;
                                                                                        } else {
                                                                                            z7 = false;
                                                                                        }
                                                                                        zkf.c(z7);
                                                                                        if (C.l != null) {
                                                                                            ywn ywnVar2 = C.h;
                                                                                            zhv zhvVarA7 = a();
                                                                                            zhvVarA7.f(str5, "notReleased");
                                                                                            zhvVarA7.f("streamKey", C.c);
                                                                                            zhvVarA7.f("segmentOffset", String.valueOf(C.d));
                                                                                            zhvVarA7.f("dataStartOffset", String.valueOf(j3));
                                                                                            zhvVarA7.f(str3, String.valueOf(jA));
                                                                                            ywnVar2.k(zhvVarA7.a());
                                                                                            C.c();
                                                                                            C.d();
                                                                                        }
                                                                                        try {
                                                                                            C.e = j3;
                                                                                            zjrVar = C.g;
                                                                                            if (zjrVar.bF()) {
                                                                                                C.j.set(j3);
                                                                                                j4 = jA;
                                                                                            } else {
                                                                                                j3 = C.d;
                                                                                                j4 = C.f;
                                                                                                C.j.set(j3);
                                                                                            }
                                                                                            i2 = 0;
                                                                                            while (true) {
                                                                                                if (i2 > i) {
                                                                                                    tqjVar = C.g.v;
                                                                                                    int i6 = tqr.a;
                                                                                                    if (tqjVar.k(1073830473)) {
                                                                                                        jskVar = C.a;
                                                                                                        if ((jskVar instanceof ygu) && !((ygu) jskVar).z()) {
                                                                                                            throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                                                                        }
                                                                                                    }
                                                                                                    throw new IOException("Unable to obtain writelock.");
                                                                                                }
                                                                                                try {
                                                                                                    String str32 = str15;
                                                                                                    String str33 = str14;
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (zjrVar.j.m(121, 45421225L)) {
                                                                                                                jspVarC = C.a.b(C.c, j3);
                                                                                                            } else {
                                                                                                                jspVarC = C.a.c(C.c, j3);
                                                                                                            }
                                                                                                            if (jspVarC != null) {
                                                                                                                if (jspVarC.b()) {
                                                                                                                    C.l = jspVarC;
                                                                                                                    byhVar = new byh();
                                                                                                                    byhVar.a = Uri.EMPTY;
                                                                                                                    byhVar.i = C.c;
                                                                                                                    byhVar.h = j4;
                                                                                                                    byhVar.b = j3;
                                                                                                                    if (C.i) {
                                                                                                                        ypp yppVarA2 = ypq.a();
                                                                                                                        yppVarA2.i(C.h);
                                                                                                                        byhVar.k = yppVarA2.a();
                                                                                                                    }
                                                                                                                    C.b.b(byhVar.a());
                                                                                                                    C.m = 2;
                                                                                                                    break;
                                                                                                                }
                                                                                                                tqjVar2 = zjrVar.v;
                                                                                                                int i7 = tqr.a;
                                                                                                                if (tqjVar2.k(1073830414)) {
                                                                                                                    throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                                                                                }
                                                                                                                C.a.l(jspVarC);
                                                                                                            }
                                                                                                            i2++;
                                                                                                            str15 = str32;
                                                                                                            str14 = str33;
                                                                                                            i = 1;
                                                                                                        } catch (InterruptedException e2) {
                                                                                                            e = e2;
                                                                                                            throw new IOException("Obtaining writelock interrupted.", e);
                                                                                                        }
                                                                                                    } catch (yfd e3) {
                                                                                                        e = e3;
                                                                                                        C.a();
                                                                                                        throw e;
                                                                                                    } catch (yfe e4) {
                                                                                                        e = e4;
                                                                                                        C.a();
                                                                                                        throw e;
                                                                                                    } catch (Exception e5) {
                                                                                                        e = e5;
                                                                                                        C.a();
                                                                                                        C.c();
                                                                                                        throw e;
                                                                                                    }
                                                                                                } catch (InterruptedException e6) {
                                                                                                    e = e6;
                                                                                                }
                                                                                            }
                                                                                        } catch (yfd e7) {
                                                                                            e = e7;
                                                                                            C.a();
                                                                                            throw e;
                                                                                        } catch (yfe e8) {
                                                                                            e = e8;
                                                                                            C.a();
                                                                                            throw e;
                                                                                        } catch (Exception e9) {
                                                                                            e = e9;
                                                                                        }
                                                                                    } else if (this.d) {
                                                                                        C.b(false);
                                                                                        if (this.e) {
                                                                                            elqVar = this.g;
                                                                                            str16 = this.m;
                                                                                            agqjVar = new agqj(this.h);
                                                                                            elqVar.F(str16, agqjVar);
                                                                                        }
                                                                                        this.k.remove(this.b);
                                                                                    }
                                                                                }
                                                                                if (C.m == 2) {
                                                                                    ygpVar = this.l;
                                                                                    j2 = this.a;
                                                                                    if (C.m == 2) {
                                                                                        z6 = true;
                                                                                    } else {
                                                                                        z6 = false;
                                                                                    }
                                                                                    zkf.c(z6);
                                                                                    if (C.l == null) {
                                                                                        throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                                                                    }
                                                                                    atomicLong = C.j;
                                                                                    if (j2 != atomicLong.get()) {
                                                                                        C.a();
                                                                                        C.c();
                                                                                        throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                                                                    }
                                                                                    byte[] bArrC2 = ygpVar.c();
                                                                                    int iA2 = ygpVar.a();
                                                                                    try {
                                                                                        C.b.c(bArrC2, 0, iA2);
                                                                                        long j10 = iA2;
                                                                                        atomicLong.addAndGet(j10);
                                                                                        C.k.addAndGet(j10);
                                                                                        if (this.d) {
                                                                                            C.b(false);
                                                                                            if (this.e) {
                                                                                                elqVar = this.g;
                                                                                                str16 = this.m;
                                                                                                agqjVar = new agqj(this.h);
                                                                                                elqVar.F(str16, agqjVar);
                                                                                            }
                                                                                            this.k.remove(this.b);
                                                                                        }
                                                                                    } catch (Exception e10) {
                                                                                        C.a();
                                                                                        C.c();
                                                                                        throw e10;
                                                                                    }
                                                                                } else if (this.d) {
                                                                                    C.b(false);
                                                                                    if (this.e) {
                                                                                        elqVar = this.g;
                                                                                        str16 = this.m;
                                                                                        agqjVar = new agqj(this.h);
                                                                                        elqVar.F(str16, agqjVar);
                                                                                    }
                                                                                    this.k.remove(this.b);
                                                                                }
                                                                            } catch (yfd unused4) {
                                                                                r10 = -1;
                                                                                str13 = str12;
                                                                                r19 = str10;
                                                                                ?? A4 = a();
                                                                                A4.f(str13, this.b.toString());
                                                                                A4.f(str4, String.valueOf(this.a));
                                                                                A4.f(r10, r19);
                                                                                b(A4.a(), true);
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    this.g.F(this.m, new agqj(this.h));
                                                                                }
                                                                                if (this.d) {
                                                                                    this.k.remove(this.b);
                                                                                }
                                                                            } catch (yfe unused5) {
                                                                                ?? A5 = a();
                                                                                yfhVar = this.b;
                                                                                A5.f(str12, yfhVar.toString());
                                                                                A5.f(str4, String.valueOf(this.a));
                                                                                A5.f(r18, "cacheUninitialized");
                                                                                b(A5.a(), true);
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    this.g.F(this.m, new agqj(this.h));
                                                                                }
                                                                                if (this.d) {
                                                                                    this.k.remove(yfhVar);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str14 = str10;
                                                                        str15 = str2;
                                                                        str12 = str9;
                                                                        i = 1;
                                                                        if (this.c) {
                                                                            if (C.m == 1) {
                                                                                if (this.d) {
                                                                                }
                                                                                j3 = this.a;
                                                                                if (C.m == 1) {
                                                                                    z7 = true;
                                                                                } else {
                                                                                    z7 = false;
                                                                                }
                                                                                zkf.c(z7);
                                                                                if (C.l != null) {
                                                                                    ywn ywnVar3 = C.h;
                                                                                    zhv zhvVarA8 = a();
                                                                                    zhvVarA8.f(str5, "notReleased");
                                                                                    zhvVarA8.f("streamKey", C.c);
                                                                                    zhvVarA8.f("segmentOffset", String.valueOf(C.d));
                                                                                    zhvVarA8.f("dataStartOffset", String.valueOf(j3));
                                                                                    zhvVarA8.f(str3, String.valueOf(jA));
                                                                                    ywnVar3.k(zhvVarA8.a());
                                                                                    C.c();
                                                                                    C.d();
                                                                                }
                                                                                C.e = j3;
                                                                                zjrVar = C.g;
                                                                                if (zjrVar.bF()) {
                                                                                    C.j.set(j3);
                                                                                    j4 = jA;
                                                                                } else {
                                                                                    j3 = C.d;
                                                                                    j4 = C.f;
                                                                                    C.j.set(j3);
                                                                                }
                                                                                i2 = 0;
                                                                                while (true) {
                                                                                    if (i2 > i) {
                                                                                        tqjVar = C.g.v;
                                                                                        int i8 = tqr.a;
                                                                                        if (tqjVar.k(1073830473)) {
                                                                                            jskVar = C.a;
                                                                                            if (jskVar instanceof ygu) {
                                                                                                throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                                                            }
                                                                                        }
                                                                                        throw new IOException("Unable to obtain writelock.");
                                                                                    }
                                                                                    String str34 = str15;
                                                                                    String str35 = str14;
                                                                                    if (zjrVar.j.m(121, 45421225L)) {
                                                                                        jspVarC = C.a.b(C.c, j3);
                                                                                    } else {
                                                                                        jspVarC = C.a.c(C.c, j3);
                                                                                    }
                                                                                    if (jspVarC != null) {
                                                                                        if (jspVarC.b()) {
                                                                                            C.l = jspVarC;
                                                                                            byhVar = new byh();
                                                                                            byhVar.a = Uri.EMPTY;
                                                                                            byhVar.i = C.c;
                                                                                            byhVar.h = j4;
                                                                                            byhVar.b = j3;
                                                                                            if (C.i) {
                                                                                                ypp yppVarA3 = ypq.a();
                                                                                                yppVarA3.i(C.h);
                                                                                                byhVar.k = yppVarA3.a();
                                                                                            }
                                                                                            C.b.b(byhVar.a());
                                                                                            C.m = 2;
                                                                                            break;
                                                                                        }
                                                                                        tqjVar2 = zjrVar.v;
                                                                                        int i9 = tqr.a;
                                                                                        if (tqjVar2.k(1073830414)) {
                                                                                            throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                                                        }
                                                                                        C.a.l(jspVarC);
                                                                                    }
                                                                                    i2++;
                                                                                    str15 = str34;
                                                                                    str14 = str35;
                                                                                    i = 1;
                                                                                }
                                                                            } else if (this.d) {
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    elqVar = this.g;
                                                                                    str16 = this.m;
                                                                                    agqjVar = new agqj(this.h);
                                                                                    elqVar.F(str16, agqjVar);
                                                                                }
                                                                                this.k.remove(this.b);
                                                                            }
                                                                        }
                                                                        if (C.m == 2) {
                                                                            ygpVar = this.l;
                                                                            j2 = this.a;
                                                                            if (C.m == 2) {
                                                                                z6 = true;
                                                                            } else {
                                                                                z6 = false;
                                                                            }
                                                                            zkf.c(z6);
                                                                            if (C.l == null) {
                                                                                throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                                                            }
                                                                            atomicLong = C.j;
                                                                            if (j2 != atomicLong.get()) {
                                                                                C.a();
                                                                                C.c();
                                                                                throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                                                            }
                                                                            byte[] bArrC3 = ygpVar.c();
                                                                            int iA3 = ygpVar.a();
                                                                            C.b.c(bArrC3, 0, iA3);
                                                                            long j11 = iA3;
                                                                            atomicLong.addAndGet(j11);
                                                                            C.k.addAndGet(j11);
                                                                            if (this.d) {
                                                                                C.b(false);
                                                                                if (this.e) {
                                                                                    elqVar = this.g;
                                                                                    str16 = this.m;
                                                                                    agqjVar = new agqj(this.h);
                                                                                    elqVar.F(str16, agqjVar);
                                                                                }
                                                                                this.k.remove(this.b);
                                                                            }
                                                                        } else if (this.d) {
                                                                            C.b(false);
                                                                            if (this.e) {
                                                                                elqVar = this.g;
                                                                                str16 = this.m;
                                                                                agqjVar = new agqj(this.h);
                                                                                elqVar.F(str16, agqjVar);
                                                                            }
                                                                            this.k.remove(this.b);
                                                                        }
                                                                    }
                                                                } catch (yfd unused6) {
                                                                    r19 = r12;
                                                                    str13 = str12;
                                                                    r10 = str11;
                                                                } catch (yfe unused7) {
                                                                    r18 = str11;
                                                                }
                                                            } catch (yfd unused8) {
                                                                str12 = str9;
                                                            }
                                                        } else if (this.d) {
                                                            C.b(false);
                                                            if (this.e) {
                                                                elqVar = this.g;
                                                                str16 = this.m;
                                                                agqjVar = new agqj(this.h);
                                                                elqVar.F(str16, agqjVar);
                                                            }
                                                            this.k.remove(this.b);
                                                        }
                                                    } catch (Exception e11) {
                                                        try {
                                                            c(e11, "runTask");
                                                            C.b(true);
                                                            if (this.e) {
                                                                this.g.F(this.m, new agqj(this.h));
                                                            }
                                                            if (this.d) {
                                                                this.k.remove(this.b);
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            z2 = true;
                                                            r17 = 1;
                                                            r2 = C;
                                                            th = th;
                                                            z3 = this.d;
                                                            r13 = z2;
                                                            if (!z3) {
                                                                if (!z2) {
                                                                    throw th;
                                                                }
                                                                r13 = r17;
                                                            }
                                                            r2.b(r13);
                                                            if (this.e) {
                                                                this.g.F(this.m, new agqj(this.h));
                                                            }
                                                            if (!z3) {
                                                                throw th;
                                                            }
                                                            this.k.remove(this.b);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (yfe unused9) {
                                                    r18 = str2;
                                                    str12 = str9;
                                                }
                                            } catch (yfd unused10) {
                                                r10 = str2;
                                                str13 = str9;
                                                r19 = str10;
                                            }
                                        } catch (Exception e12) {
                                            c(e12, "endWritingSegment");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z = false;
                                    r16 = 1;
                                    r3 = C;
                                    z2 = z;
                                    r2 = r3;
                                    r17 = r16;
                                    th = th;
                                    z3 = this.d;
                                    r13 = z2;
                                    if (!z3) {
                                        if (!z2) {
                                            throw th;
                                        }
                                        r13 = r17;
                                    }
                                    r2.b(r13);
                                    if (this.e) {
                                        this.g.F(this.m, new agqj(this.h));
                                    }
                                    if (!z3) {
                                        throw th;
                                    }
                                    this.k.remove(this.b);
                                    throw th;
                                }
                            }
                            this.l.b();
                        }
                        int i10 = yfhVar3.c;
                        str22 = "true";
                        if (i10 != 0) {
                            zhv zhvVarA9 = a();
                            zhvVarA9.f("key", this.m);
                            zhvVarA9.f("init", "true");
                            zhvVarA9.f("seqNum", String.valueOf(i10));
                            yevVar = new yev(new yey(zhvVarA9.a(), false));
                        } else {
                            boolean z8 = this.d;
                            if (z8) {
                                ygp ygpVar2 = this.l;
                                if (ygpVar2.a() == 0) {
                                    zhv zhvVarA10 = a();
                                    zhvVarA10.f("key", this.m);
                                    zhvVarA10.f("expectedFullInitIndexSegment", "true");
                                    zhvVarA10.f("dataLength", String.valueOf(ygpVar2.a()));
                                    yevVar = new yev(new yey(zhvVarA10.a(), false));
                                }
                            }
                            jsk jskVar3 = this.h;
                            Key key2 = this.i;
                            long jA2 = z8 ? this.l.a() : -1L;
                            zjr zjrVar3 = this.j;
                            ydm ydmVar = new ydm(this);
                            yhi yhiVar3 = this.f;
                            j6 = 0;
                            str19 = "writerKey";
                            long j12 = jA2;
                            str17 = "streamOffset";
                            str18 = "c";
                            str3 = "dataLength";
                            str20 = "alreadyCached";
                            yfiVarE = yfi.e(jskVar3, key2, yfhVar3, 0L, j12, zjrVar3, ydmVar, yhiVar3, this.n);
                            str2 = "m";
                            str21 = str24;
                            j5 = j12;
                            yhiVar = yhiVar3;
                        }
                        map.put(yfhVar3, yfiVarE);
                        str4 = str17;
                        str5 = str18;
                        str8 = j6;
                        str7 = str21;
                        r11 = j5;
                        str = str20;
                        str6 = str19;
                    } else {
                        zhv zhvVarA11 = a();
                        zhvVarA11.f("writerKey", yfhVar3.toString());
                        zhvVarA11.f("isStartOfSegment", "false");
                        zhvVarA11.f("isEndOfSegment", String.valueOf(this.d));
                        zhvVarA11.f("c", "recreateWriter");
                        yevVar = new yev(new yey(zhvVarA11.a(), true));
                    }
                    str10 = "alreadyCached";
                    str2 = "m";
                    str4 = "streamOffset";
                    str5 = "c";
                    str9 = "writerKey";
                    C = yevVar;
                    str3 = "dataLength";
                    str12 = str23;
                    str11 = str24;
                    r12 = str25;
                    r15 = str22;
                    if (C.b() == 2) {
                        b(((yey) C.a()).a, ((yey) C.a()).b);
                    } else {
                        C = C.c();
                        if (C.m != 3) {
                            z4 = this.d;
                            if (z4) {
                                z5 = this.e;
                                if (!z5) {
                                    j = C.f;
                                    if (j != -1) {
                                        if (this.h.o(C.c, C.d, j)) {
                                            zhv zhvVarA12 = a();
                                            yfhVar2 = this.b;
                                            str12 = str9;
                                            zhvVarA12.f(str12, yfhVar2.toString());
                                            zhvVarA12.f(str4, String.valueOf(this.a));
                                            zhvVarA12.f(str2, str10);
                                            b(zhvVarA12.a(), true);
                                            C.b(false);
                                            if (z5) {
                                                this.g.F(this.m, new agqj(this.h));
                                            }
                                            if (z4) {
                                                this.k.remove(yfhVar2);
                                            }
                                        }
                                    }
                                    str14 = str10;
                                    str15 = str2;
                                    str12 = str9;
                                    i = 1;
                                    if (this.c) {
                                        if (C.m == 1) {
                                            if (this.d) {
                                            }
                                            j3 = this.a;
                                            if (C.m == 1) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            zkf.c(z7);
                                            if (C.l != null) {
                                                ywn ywnVar4 = C.h;
                                                zhv zhvVarA13 = a();
                                                zhvVarA13.f(str5, "notReleased");
                                                zhvVarA13.f("streamKey", C.c);
                                                zhvVarA13.f("segmentOffset", String.valueOf(C.d));
                                                zhvVarA13.f("dataStartOffset", String.valueOf(j3));
                                                zhvVarA13.f(str3, String.valueOf(jA));
                                                ywnVar4.k(zhvVarA13.a());
                                                C.c();
                                                C.d();
                                            }
                                            C.e = j3;
                                            zjrVar = C.g;
                                            if (zjrVar.bF()) {
                                                C.j.set(j3);
                                                j4 = jA;
                                            } else {
                                                j3 = C.d;
                                                j4 = C.f;
                                                C.j.set(j3);
                                            }
                                            i2 = 0;
                                            while (true) {
                                                if (i2 > i) {
                                                    tqjVar = C.g.v;
                                                    int i11 = tqr.a;
                                                    if (tqjVar.k(1073830473)) {
                                                        jskVar = C.a;
                                                        if (jskVar instanceof ygu) {
                                                            throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                        }
                                                    }
                                                    throw new IOException("Unable to obtain writelock.");
                                                }
                                                String str36 = str15;
                                                String str37 = str14;
                                                if (zjrVar.j.m(121, 45421225L)) {
                                                    jspVarC = C.a.b(C.c, j3);
                                                } else {
                                                    jspVarC = C.a.c(C.c, j3);
                                                }
                                                if (jspVarC != null) {
                                                    if (jspVarC.b()) {
                                                        C.l = jspVarC;
                                                        byhVar = new byh();
                                                        byhVar.a = Uri.EMPTY;
                                                        byhVar.i = C.c;
                                                        byhVar.h = j4;
                                                        byhVar.b = j3;
                                                        if (C.i) {
                                                            ypp yppVarA4 = ypq.a();
                                                            yppVarA4.i(C.h);
                                                            byhVar.k = yppVarA4.a();
                                                        }
                                                        C.b.b(byhVar.a());
                                                        C.m = 2;
                                                        break;
                                                    }
                                                    tqjVar2 = zjrVar.v;
                                                    int i12 = tqr.a;
                                                    if (tqjVar2.k(1073830414)) {
                                                        throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                    }
                                                    C.a.l(jspVarC);
                                                }
                                                i2++;
                                                str15 = str36;
                                                str14 = str37;
                                                i = 1;
                                            }
                                        } else if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    }
                                    if (C.m == 2) {
                                        ygpVar = this.l;
                                        j2 = this.a;
                                        if (C.m == 2) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        zkf.c(z6);
                                        if (C.l == null) {
                                            throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                        }
                                        atomicLong = C.j;
                                        if (j2 != atomicLong.get()) {
                                            C.a();
                                            C.c();
                                            throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                        }
                                        byte[] bArrC4 = ygpVar.c();
                                        int iA4 = ygpVar.a();
                                        C.b.c(bArrC4, 0, iA4);
                                        long j13 = iA4;
                                        atomicLong.addAndGet(j13);
                                        C.k.addAndGet(j13);
                                        if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                } else if (this.g.E(this.m, new agqj(this.h)) != null) {
                                    zhv zhvVarA14 = a();
                                    yfhVar2 = this.b;
                                    str12 = str9;
                                    zhvVarA14.f(str12, yfhVar2.toString());
                                    zhvVarA14.f(str4, String.valueOf(this.a));
                                    zhvVarA14.f(str2, str10);
                                    b(zhvVarA14.a(), true);
                                    C.b(false);
                                    if (z5) {
                                        this.g.F(this.m, new agqj(this.h));
                                    }
                                    if (z4) {
                                        this.k.remove(yfhVar2);
                                    }
                                } else {
                                    str14 = str10;
                                    str15 = str2;
                                    str12 = str9;
                                    i = 1;
                                    if (this.c) {
                                        if (C.m == 1) {
                                            if (this.d) {
                                            }
                                            j3 = this.a;
                                            if (C.m == 1) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            zkf.c(z7);
                                            if (C.l != null) {
                                                ywn ywnVar5 = C.h;
                                                zhv zhvVarA15 = a();
                                                zhvVarA15.f(str5, "notReleased");
                                                zhvVarA15.f("streamKey", C.c);
                                                zhvVarA15.f("segmentOffset", String.valueOf(C.d));
                                                zhvVarA15.f("dataStartOffset", String.valueOf(j3));
                                                zhvVarA15.f(str3, String.valueOf(jA));
                                                ywnVar5.k(zhvVarA15.a());
                                                C.c();
                                                C.d();
                                            }
                                            C.e = j3;
                                            zjrVar = C.g;
                                            if (zjrVar.bF()) {
                                                C.j.set(j3);
                                                j4 = jA;
                                            } else {
                                                j3 = C.d;
                                                j4 = C.f;
                                                C.j.set(j3);
                                            }
                                            i2 = 0;
                                            while (true) {
                                                if (i2 > i) {
                                                    tqjVar = C.g.v;
                                                    int i13 = tqr.a;
                                                    if (tqjVar.k(1073830473)) {
                                                        jskVar = C.a;
                                                        if (jskVar instanceof ygu) {
                                                            throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                        }
                                                    }
                                                    throw new IOException("Unable to obtain writelock.");
                                                }
                                                String str38 = str15;
                                                String str39 = str14;
                                                if (zjrVar.j.m(121, 45421225L)) {
                                                    jspVarC = C.a.b(C.c, j3);
                                                } else {
                                                    jspVarC = C.a.c(C.c, j3);
                                                }
                                                if (jspVarC != null) {
                                                    if (jspVarC.b()) {
                                                        C.l = jspVarC;
                                                        byhVar = new byh();
                                                        byhVar.a = Uri.EMPTY;
                                                        byhVar.i = C.c;
                                                        byhVar.h = j4;
                                                        byhVar.b = j3;
                                                        if (C.i) {
                                                            ypp yppVarA5 = ypq.a();
                                                            yppVarA5.i(C.h);
                                                            byhVar.k = yppVarA5.a();
                                                        }
                                                        C.b.b(byhVar.a());
                                                        C.m = 2;
                                                        break;
                                                    }
                                                    tqjVar2 = zjrVar.v;
                                                    int i14 = tqr.a;
                                                    if (tqjVar2.k(1073830414)) {
                                                        throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                    }
                                                    C.a.l(jspVarC);
                                                }
                                                i2++;
                                                str15 = str38;
                                                str14 = str39;
                                                i = 1;
                                            }
                                        } else if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    }
                                    if (C.m == 2) {
                                        ygpVar = this.l;
                                        j2 = this.a;
                                        if (C.m == 2) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        zkf.c(z6);
                                        if (C.l == null) {
                                            throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                        }
                                        atomicLong = C.j;
                                        if (j2 != atomicLong.get()) {
                                            C.a();
                                            C.c();
                                            throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                        }
                                        byte[] bArrC5 = ygpVar.c();
                                        int iA5 = ygpVar.a();
                                        C.b.c(bArrC5, 0, iA5);
                                        long j14 = iA5;
                                        atomicLong.addAndGet(j14);
                                        C.k.addAndGet(j14);
                                        if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                }
                            } else {
                                z5 = this.e;
                                if (!z5) {
                                    j = C.f;
                                    if (j != -1) {
                                        if (this.h.o(C.c, C.d, j)) {
                                            zhv zhvVarA16 = a();
                                            yfhVar2 = this.b;
                                            str12 = str9;
                                            zhvVarA16.f(str12, yfhVar2.toString());
                                            zhvVarA16.f(str4, String.valueOf(this.a));
                                            zhvVarA16.f(str2, str10);
                                            b(zhvVarA16.a(), true);
                                            C.b(false);
                                            if (z5) {
                                                this.g.F(this.m, new agqj(this.h));
                                            }
                                            if (z4) {
                                                this.k.remove(yfhVar2);
                                            }
                                        }
                                    }
                                    str14 = str10;
                                    str15 = str2;
                                    str12 = str9;
                                    i = 1;
                                    if (this.c) {
                                        if (C.m == 1) {
                                            if (this.d) {
                                            }
                                            j3 = this.a;
                                            if (C.m == 1) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            zkf.c(z7);
                                            if (C.l != null) {
                                                ywn ywnVar6 = C.h;
                                                zhv zhvVarA17 = a();
                                                zhvVarA17.f(str5, "notReleased");
                                                zhvVarA17.f("streamKey", C.c);
                                                zhvVarA17.f("segmentOffset", String.valueOf(C.d));
                                                zhvVarA17.f("dataStartOffset", String.valueOf(j3));
                                                zhvVarA17.f(str3, String.valueOf(jA));
                                                ywnVar6.k(zhvVarA17.a());
                                                C.c();
                                                C.d();
                                            }
                                            C.e = j3;
                                            zjrVar = C.g;
                                            if (zjrVar.bF()) {
                                                C.j.set(j3);
                                                j4 = jA;
                                            } else {
                                                j3 = C.d;
                                                j4 = C.f;
                                                C.j.set(j3);
                                            }
                                            i2 = 0;
                                            while (true) {
                                                if (i2 > i) {
                                                    tqjVar = C.g.v;
                                                    int i15 = tqr.a;
                                                    if (tqjVar.k(1073830473)) {
                                                        jskVar = C.a;
                                                        if (jskVar instanceof ygu) {
                                                            throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                        }
                                                    }
                                                    throw new IOException("Unable to obtain writelock.");
                                                }
                                                String str310 = str15;
                                                String str311 = str14;
                                                if (zjrVar.j.m(121, 45421225L)) {
                                                    jspVarC = C.a.b(C.c, j3);
                                                } else {
                                                    jspVarC = C.a.c(C.c, j3);
                                                }
                                                if (jspVarC != null) {
                                                    if (jspVarC.b()) {
                                                        C.l = jspVarC;
                                                        byhVar = new byh();
                                                        byhVar.a = Uri.EMPTY;
                                                        byhVar.i = C.c;
                                                        byhVar.h = j4;
                                                        byhVar.b = j3;
                                                        if (C.i) {
                                                            ypp yppVarA6 = ypq.a();
                                                            yppVarA6.i(C.h);
                                                            byhVar.k = yppVarA6.a();
                                                        }
                                                        C.b.b(byhVar.a());
                                                        C.m = 2;
                                                        break;
                                                    }
                                                    tqjVar2 = zjrVar.v;
                                                    int i16 = tqr.a;
                                                    if (tqjVar2.k(1073830414)) {
                                                        throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                    }
                                                    C.a.l(jspVarC);
                                                }
                                                i2++;
                                                str15 = str310;
                                                str14 = str311;
                                                i = 1;
                                            }
                                        } else if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    }
                                    if (C.m == 2) {
                                        ygpVar = this.l;
                                        j2 = this.a;
                                        if (C.m == 2) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        zkf.c(z6);
                                        if (C.l == null) {
                                            throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                        }
                                        atomicLong = C.j;
                                        if (j2 != atomicLong.get()) {
                                            C.a();
                                            C.c();
                                            throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                        }
                                        byte[] bArrC6 = ygpVar.c();
                                        int iA6 = ygpVar.a();
                                        C.b.c(bArrC6, 0, iA6);
                                        long j15 = iA6;
                                        atomicLong.addAndGet(j15);
                                        C.k.addAndGet(j15);
                                        if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                } else if (this.g.E(this.m, new agqj(this.h)) != null) {
                                    zhv zhvVarA18 = a();
                                    yfhVar2 = this.b;
                                    str12 = str9;
                                    zhvVarA18.f(str12, yfhVar2.toString());
                                    zhvVarA18.f(str4, String.valueOf(this.a));
                                    zhvVarA18.f(str2, str10);
                                    b(zhvVarA18.a(), true);
                                    C.b(false);
                                    if (z5) {
                                        this.g.F(this.m, new agqj(this.h));
                                    }
                                    if (z4) {
                                        this.k.remove(yfhVar2);
                                    }
                                } else {
                                    str14 = str10;
                                    str15 = str2;
                                    str12 = str9;
                                    i = 1;
                                    if (this.c) {
                                        if (C.m == 1) {
                                            if (this.d) {
                                            }
                                            j3 = this.a;
                                            if (C.m == 1) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            zkf.c(z7);
                                            if (C.l != null) {
                                                ywn ywnVar7 = C.h;
                                                zhv zhvVarA19 = a();
                                                zhvVarA19.f(str5, "notReleased");
                                                zhvVarA19.f("streamKey", C.c);
                                                zhvVarA19.f("segmentOffset", String.valueOf(C.d));
                                                zhvVarA19.f("dataStartOffset", String.valueOf(j3));
                                                zhvVarA19.f(str3, String.valueOf(jA));
                                                ywnVar7.k(zhvVarA19.a());
                                                C.c();
                                                C.d();
                                            }
                                            C.e = j3;
                                            zjrVar = C.g;
                                            if (zjrVar.bF()) {
                                                C.j.set(j3);
                                                j4 = jA;
                                            } else {
                                                j3 = C.d;
                                                j4 = C.f;
                                                C.j.set(j3);
                                            }
                                            i2 = 0;
                                            while (true) {
                                                if (i2 > i) {
                                                    tqjVar = C.g.v;
                                                    int i17 = tqr.a;
                                                    if (tqjVar.k(1073830473)) {
                                                        jskVar = C.a;
                                                        if (jskVar instanceof ygu) {
                                                            throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                        }
                                                    }
                                                    throw new IOException("Unable to obtain writelock.");
                                                }
                                                String str312 = str15;
                                                String str313 = str14;
                                                if (zjrVar.j.m(121, 45421225L)) {
                                                    jspVarC = C.a.b(C.c, j3);
                                                } else {
                                                    jspVarC = C.a.c(C.c, j3);
                                                }
                                                if (jspVarC != null) {
                                                    if (jspVarC.b()) {
                                                        C.l = jspVarC;
                                                        byhVar = new byh();
                                                        byhVar.a = Uri.EMPTY;
                                                        byhVar.i = C.c;
                                                        byhVar.h = j4;
                                                        byhVar.b = j3;
                                                        if (C.i) {
                                                            ypp yppVarA7 = ypq.a();
                                                            yppVarA7.i(C.h);
                                                            byhVar.k = yppVarA7.a();
                                                        }
                                                        C.b.b(byhVar.a());
                                                        C.m = 2;
                                                        break;
                                                    }
                                                    tqjVar2 = zjrVar.v;
                                                    int i18 = tqr.a;
                                                    if (tqjVar2.k(1073830414)) {
                                                        throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                    }
                                                    C.a.l(jspVarC);
                                                }
                                                i2++;
                                                str15 = str312;
                                                str14 = str313;
                                                i = 1;
                                            }
                                        } else if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    }
                                    if (C.m == 2) {
                                        ygpVar = this.l;
                                        j2 = this.a;
                                        if (C.m == 2) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        zkf.c(z6);
                                        if (C.l == null) {
                                            throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                        }
                                        atomicLong = C.j;
                                        if (j2 != atomicLong.get()) {
                                            C.a();
                                            C.c();
                                            throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                        }
                                        byte[] bArrC7 = ygpVar.c();
                                        int iA7 = ygpVar.a();
                                        C.b.c(bArrC7, 0, iA7);
                                        long j16 = iA7;
                                        atomicLong.addAndGet(j16);
                                        C.k.addAndGet(j16);
                                        if (this.d) {
                                            C.b(false);
                                            if (this.e) {
                                                elqVar = this.g;
                                                str16 = this.m;
                                                agqjVar = new agqj(this.h);
                                                elqVar.F(str16, agqjVar);
                                            }
                                            this.k.remove(this.b);
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                }
                            }
                        } else if (this.d) {
                            C.b(false);
                            if (this.e) {
                                elqVar = this.g;
                                str16 = this.m;
                                agqjVar = new agqj(this.h);
                                elqVar.F(str16, agqjVar);
                            }
                            this.k.remove(this.b);
                        }
                    }
                    this.l.b();
                }
                str = "alreadyCached";
                str2 = "m";
                str3 = "dataLength";
                str4 = "streamOffset";
                str5 = "c";
                str6 = "writerKey";
                str8 = str23;
                str7 = str24;
                r11 = str25;
                C = new yew(yfiVarE);
                str12 = str8;
                str11 = str7;
                r12 = r11;
                r15 = yhiVar;
                str10 = str;
                str9 = str6;
                if (C.b() == 2) {
                    b(((yey) C.a()).a, ((yey) C.a()).b);
                } else {
                    C = C.c();
                    if (C.m != 3) {
                        z4 = this.d;
                        if (z4) {
                            z5 = this.e;
                            if (!z5) {
                                j = C.f;
                                if (j != -1) {
                                    if (this.h.o(C.c, C.d, j)) {
                                        zhv zhvVarA110 = a();
                                        yfhVar2 = this.b;
                                        str12 = str9;
                                        zhvVarA110.f(str12, yfhVar2.toString());
                                        zhvVarA110.f(str4, String.valueOf(this.a));
                                        zhvVarA110.f(str2, str10);
                                        b(zhvVarA110.a(), true);
                                        C.b(false);
                                        if (z5) {
                                            this.g.F(this.m, new agqj(this.h));
                                        }
                                        if (z4) {
                                            this.k.remove(yfhVar2);
                                        }
                                    }
                                }
                                str14 = str10;
                                str15 = str2;
                                str12 = str9;
                                i = 1;
                                if (this.c) {
                                    if (C.m == 1) {
                                        if (this.d) {
                                        }
                                        j3 = this.a;
                                        if (C.m == 1) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        zkf.c(z7);
                                        if (C.l != null) {
                                            ywn ywnVar8 = C.h;
                                            zhv zhvVarA111 = a();
                                            zhvVarA111.f(str5, "notReleased");
                                            zhvVarA111.f("streamKey", C.c);
                                            zhvVarA111.f("segmentOffset", String.valueOf(C.d));
                                            zhvVarA111.f("dataStartOffset", String.valueOf(j3));
                                            zhvVarA111.f(str3, String.valueOf(jA));
                                            ywnVar8.k(zhvVarA111.a());
                                            C.c();
                                            C.d();
                                        }
                                        C.e = j3;
                                        zjrVar = C.g;
                                        if (zjrVar.bF()) {
                                            C.j.set(j3);
                                            j4 = jA;
                                        } else {
                                            j3 = C.d;
                                            j4 = C.f;
                                            C.j.set(j3);
                                        }
                                        i2 = 0;
                                        while (true) {
                                            if (i2 > i) {
                                                tqjVar = C.g.v;
                                                int i19 = tqr.a;
                                                if (tqjVar.k(1073830473)) {
                                                    jskVar = C.a;
                                                    if (jskVar instanceof ygu) {
                                                        throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                    }
                                                }
                                                throw new IOException("Unable to obtain writelock.");
                                            }
                                            String str314 = str15;
                                            String str315 = str14;
                                            if (zjrVar.j.m(121, 45421225L)) {
                                                jspVarC = C.a.b(C.c, j3);
                                            } else {
                                                jspVarC = C.a.c(C.c, j3);
                                            }
                                            if (jspVarC != null) {
                                                if (jspVarC.b()) {
                                                    C.l = jspVarC;
                                                    byhVar = new byh();
                                                    byhVar.a = Uri.EMPTY;
                                                    byhVar.i = C.c;
                                                    byhVar.h = j4;
                                                    byhVar.b = j3;
                                                    if (C.i) {
                                                        ypp yppVarA8 = ypq.a();
                                                        yppVarA8.i(C.h);
                                                        byhVar.k = yppVarA8.a();
                                                    }
                                                    C.b.b(byhVar.a());
                                                    C.m = 2;
                                                    break;
                                                }
                                                tqjVar2 = zjrVar.v;
                                                int i110 = tqr.a;
                                                if (tqjVar2.k(1073830414)) {
                                                    throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                }
                                                C.a.l(jspVarC);
                                            }
                                            i2++;
                                            str15 = str314;
                                            str14 = str315;
                                            i = 1;
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                }
                                if (C.m == 2) {
                                    ygpVar = this.l;
                                    j2 = this.a;
                                    if (C.m == 2) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zkf.c(z6);
                                    if (C.l == null) {
                                        throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                    }
                                    atomicLong = C.j;
                                    if (j2 != atomicLong.get()) {
                                        C.a();
                                        C.c();
                                        throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                    }
                                    byte[] bArrC8 = ygpVar.c();
                                    int iA8 = ygpVar.a();
                                    C.b.c(bArrC8, 0, iA8);
                                    long j17 = iA8;
                                    atomicLong.addAndGet(j17);
                                    C.k.addAndGet(j17);
                                    if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                } else if (this.d) {
                                    C.b(false);
                                    if (this.e) {
                                        elqVar = this.g;
                                        str16 = this.m;
                                        agqjVar = new agqj(this.h);
                                        elqVar.F(str16, agqjVar);
                                    }
                                    this.k.remove(this.b);
                                }
                            } else if (this.g.E(this.m, new agqj(this.h)) != null) {
                                zhv zhvVarA112 = a();
                                yfhVar2 = this.b;
                                str12 = str9;
                                zhvVarA112.f(str12, yfhVar2.toString());
                                zhvVarA112.f(str4, String.valueOf(this.a));
                                zhvVarA112.f(str2, str10);
                                b(zhvVarA112.a(), true);
                                C.b(false);
                                if (z5) {
                                    this.g.F(this.m, new agqj(this.h));
                                }
                                if (z4) {
                                    this.k.remove(yfhVar2);
                                }
                            } else {
                                str14 = str10;
                                str15 = str2;
                                str12 = str9;
                                i = 1;
                                if (this.c) {
                                    if (C.m == 1) {
                                        if (this.d) {
                                        }
                                        j3 = this.a;
                                        if (C.m == 1) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        zkf.c(z7);
                                        if (C.l != null) {
                                            ywn ywnVar9 = C.h;
                                            zhv zhvVarA113 = a();
                                            zhvVarA113.f(str5, "notReleased");
                                            zhvVarA113.f("streamKey", C.c);
                                            zhvVarA113.f("segmentOffset", String.valueOf(C.d));
                                            zhvVarA113.f("dataStartOffset", String.valueOf(j3));
                                            zhvVarA113.f(str3, String.valueOf(jA));
                                            ywnVar9.k(zhvVarA113.a());
                                            C.c();
                                            C.d();
                                        }
                                        C.e = j3;
                                        zjrVar = C.g;
                                        if (zjrVar.bF()) {
                                            C.j.set(j3);
                                            j4 = jA;
                                        } else {
                                            j3 = C.d;
                                            j4 = C.f;
                                            C.j.set(j3);
                                        }
                                        i2 = 0;
                                        while (true) {
                                            if (i2 > i) {
                                                tqjVar = C.g.v;
                                                int i111 = tqr.a;
                                                if (tqjVar.k(1073830473)) {
                                                    jskVar = C.a;
                                                    if (jskVar instanceof ygu) {
                                                        throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                    }
                                                }
                                                throw new IOException("Unable to obtain writelock.");
                                            }
                                            String str316 = str15;
                                            String str317 = str14;
                                            if (zjrVar.j.m(121, 45421225L)) {
                                                jspVarC = C.a.b(C.c, j3);
                                            } else {
                                                jspVarC = C.a.c(C.c, j3);
                                            }
                                            if (jspVarC != null) {
                                                if (jspVarC.b()) {
                                                    C.l = jspVarC;
                                                    byhVar = new byh();
                                                    byhVar.a = Uri.EMPTY;
                                                    byhVar.i = C.c;
                                                    byhVar.h = j4;
                                                    byhVar.b = j3;
                                                    if (C.i) {
                                                        ypp yppVarA9 = ypq.a();
                                                        yppVarA9.i(C.h);
                                                        byhVar.k = yppVarA9.a();
                                                    }
                                                    C.b.b(byhVar.a());
                                                    C.m = 2;
                                                    break;
                                                }
                                                tqjVar2 = zjrVar.v;
                                                int i112 = tqr.a;
                                                if (tqjVar2.k(1073830414)) {
                                                    throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                }
                                                C.a.l(jspVarC);
                                            }
                                            i2++;
                                            str15 = str316;
                                            str14 = str317;
                                            i = 1;
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                }
                                if (C.m == 2) {
                                    ygpVar = this.l;
                                    j2 = this.a;
                                    if (C.m == 2) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zkf.c(z6);
                                    if (C.l == null) {
                                        throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                    }
                                    atomicLong = C.j;
                                    if (j2 != atomicLong.get()) {
                                        C.a();
                                        C.c();
                                        throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                    }
                                    byte[] bArrC9 = ygpVar.c();
                                    int iA9 = ygpVar.a();
                                    C.b.c(bArrC9, 0, iA9);
                                    long j18 = iA9;
                                    atomicLong.addAndGet(j18);
                                    C.k.addAndGet(j18);
                                    if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                } else if (this.d) {
                                    C.b(false);
                                    if (this.e) {
                                        elqVar = this.g;
                                        str16 = this.m;
                                        agqjVar = new agqj(this.h);
                                        elqVar.F(str16, agqjVar);
                                    }
                                    this.k.remove(this.b);
                                }
                            }
                        } else {
                            z5 = this.e;
                            if (!z5) {
                                j = C.f;
                                if (j != -1) {
                                    if (this.h.o(C.c, C.d, j)) {
                                        zhv zhvVarA114 = a();
                                        yfhVar2 = this.b;
                                        str12 = str9;
                                        zhvVarA114.f(str12, yfhVar2.toString());
                                        zhvVarA114.f(str4, String.valueOf(this.a));
                                        zhvVarA114.f(str2, str10);
                                        b(zhvVarA114.a(), true);
                                        C.b(false);
                                        if (z5) {
                                            this.g.F(this.m, new agqj(this.h));
                                        }
                                        if (z4) {
                                            this.k.remove(yfhVar2);
                                        }
                                    }
                                }
                                str14 = str10;
                                str15 = str2;
                                str12 = str9;
                                i = 1;
                                if (this.c) {
                                    if (C.m == 1) {
                                        if (this.d) {
                                        }
                                        j3 = this.a;
                                        if (C.m == 1) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        zkf.c(z7);
                                        if (C.l != null) {
                                            ywn ywnVar10 = C.h;
                                            zhv zhvVarA115 = a();
                                            zhvVarA115.f(str5, "notReleased");
                                            zhvVarA115.f("streamKey", C.c);
                                            zhvVarA115.f("segmentOffset", String.valueOf(C.d));
                                            zhvVarA115.f("dataStartOffset", String.valueOf(j3));
                                            zhvVarA115.f(str3, String.valueOf(jA));
                                            ywnVar10.k(zhvVarA115.a());
                                            C.c();
                                            C.d();
                                        }
                                        C.e = j3;
                                        zjrVar = C.g;
                                        if (zjrVar.bF()) {
                                            C.j.set(j3);
                                            j4 = jA;
                                        } else {
                                            j3 = C.d;
                                            j4 = C.f;
                                            C.j.set(j3);
                                        }
                                        i2 = 0;
                                        while (true) {
                                            if (i2 > i) {
                                                tqjVar = C.g.v;
                                                int i113 = tqr.a;
                                                if (tqjVar.k(1073830473)) {
                                                    jskVar = C.a;
                                                    if (jskVar instanceof ygu) {
                                                        throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                    }
                                                }
                                                throw new IOException("Unable to obtain writelock.");
                                            }
                                            String str318 = str15;
                                            String str319 = str14;
                                            if (zjrVar.j.m(121, 45421225L)) {
                                                jspVarC = C.a.b(C.c, j3);
                                            } else {
                                                jspVarC = C.a.c(C.c, j3);
                                            }
                                            if (jspVarC != null) {
                                                if (jspVarC.b()) {
                                                    C.l = jspVarC;
                                                    byhVar = new byh();
                                                    byhVar.a = Uri.EMPTY;
                                                    byhVar.i = C.c;
                                                    byhVar.h = j4;
                                                    byhVar.b = j3;
                                                    if (C.i) {
                                                        ypp yppVarA10 = ypq.a();
                                                        yppVarA10.i(C.h);
                                                        byhVar.k = yppVarA10.a();
                                                    }
                                                    C.b.b(byhVar.a());
                                                    C.m = 2;
                                                    break;
                                                }
                                                tqjVar2 = zjrVar.v;
                                                int i114 = tqr.a;
                                                if (tqjVar2.k(1073830414)) {
                                                    throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                }
                                                C.a.l(jspVarC);
                                            }
                                            i2++;
                                            str15 = str318;
                                            str14 = str319;
                                            i = 1;
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                }
                                if (C.m == 2) {
                                    ygpVar = this.l;
                                    j2 = this.a;
                                    if (C.m == 2) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zkf.c(z6);
                                    if (C.l == null) {
                                        throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                    }
                                    atomicLong = C.j;
                                    if (j2 != atomicLong.get()) {
                                        C.a();
                                        C.c();
                                        throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                    }
                                    byte[] bArrC10 = ygpVar.c();
                                    int iA10 = ygpVar.a();
                                    C.b.c(bArrC10, 0, iA10);
                                    long j19 = iA10;
                                    atomicLong.addAndGet(j19);
                                    C.k.addAndGet(j19);
                                    if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                } else if (this.d) {
                                    C.b(false);
                                    if (this.e) {
                                        elqVar = this.g;
                                        str16 = this.m;
                                        agqjVar = new agqj(this.h);
                                        elqVar.F(str16, agqjVar);
                                    }
                                    this.k.remove(this.b);
                                }
                            } else if (this.g.E(this.m, new agqj(this.h)) != null) {
                                zhv zhvVarA116 = a();
                                yfhVar2 = this.b;
                                str12 = str9;
                                zhvVarA116.f(str12, yfhVar2.toString());
                                zhvVarA116.f(str4, String.valueOf(this.a));
                                zhvVarA116.f(str2, str10);
                                b(zhvVarA116.a(), true);
                                C.b(false);
                                if (z5) {
                                    this.g.F(this.m, new agqj(this.h));
                                }
                                if (z4) {
                                    this.k.remove(yfhVar2);
                                }
                            } else {
                                str14 = str10;
                                str15 = str2;
                                str12 = str9;
                                i = 1;
                                if (this.c) {
                                    if (C.m == 1) {
                                        if (this.d) {
                                        }
                                        j3 = this.a;
                                        if (C.m == 1) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        zkf.c(z7);
                                        if (C.l != null) {
                                            ywn ywnVar11 = C.h;
                                            zhv zhvVarA117 = a();
                                            zhvVarA117.f(str5, "notReleased");
                                            zhvVarA117.f("streamKey", C.c);
                                            zhvVarA117.f("segmentOffset", String.valueOf(C.d));
                                            zhvVarA117.f("dataStartOffset", String.valueOf(j3));
                                            zhvVarA117.f(str3, String.valueOf(jA));
                                            ywnVar11.k(zhvVarA117.a());
                                            C.c();
                                            C.d();
                                        }
                                        C.e = j3;
                                        zjrVar = C.g;
                                        if (zjrVar.bF()) {
                                            C.j.set(j3);
                                            j4 = jA;
                                        } else {
                                            j3 = C.d;
                                            j4 = C.f;
                                            C.j.set(j3);
                                        }
                                        i2 = 0;
                                        while (true) {
                                            if (i2 > i) {
                                                tqjVar = C.g.v;
                                                int i115 = tqr.a;
                                                if (tqjVar.k(1073830473)) {
                                                    jskVar = C.a;
                                                    if (jskVar instanceof ygu) {
                                                        throw new yfe("Cache not initialized for key: " + C.c + ", position: " + j3);
                                                    }
                                                }
                                                throw new IOException("Unable to obtain writelock.");
                                            }
                                            String str3110 = str15;
                                            String str3111 = str14;
                                            if (zjrVar.j.m(121, 45421225L)) {
                                                jspVarC = C.a.b(C.c, j3);
                                            } else {
                                                jspVarC = C.a.c(C.c, j3);
                                            }
                                            if (jspVarC != null) {
                                                if (jspVarC.b()) {
                                                    C.l = jspVarC;
                                                    byhVar = new byh();
                                                    byhVar.a = Uri.EMPTY;
                                                    byhVar.i = C.c;
                                                    byhVar.h = j4;
                                                    byhVar.b = j3;
                                                    if (C.i) {
                                                        ypp yppVarA11 = ypq.a();
                                                        yppVarA11.i(C.h);
                                                        byhVar.k = yppVarA11.a();
                                                    }
                                                    C.b.b(byhVar.a());
                                                    C.m = 2;
                                                    break;
                                                }
                                                tqjVar2 = zjrVar.v;
                                                int i116 = tqr.a;
                                                if (tqjVar2.k(1073830414)) {
                                                    throw new yfd("Segment already cached for key: " + C.c + ", position: " + j3);
                                                }
                                                C.a.l(jspVarC);
                                            }
                                            i2++;
                                            str15 = str3110;
                                            str14 = str3111;
                                            i = 1;
                                        }
                                    } else if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                }
                                if (C.m == 2) {
                                    ygpVar = this.l;
                                    j2 = this.a;
                                    if (C.m == 2) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zkf.c(z6);
                                    if (C.l == null) {
                                        throw new IllegalStateException("Not holding writeLock. Key.".concat(C.c));
                                    }
                                    atomicLong = C.j;
                                    if (j2 != atomicLong.get()) {
                                        C.a();
                                        C.c();
                                        throw new IllegalArgumentException("Out of order cache write: key." + C.c + ";expected." + atomicLong.toString() + ";received." + j2);
                                    }
                                    byte[] bArrC11 = ygpVar.c();
                                    int iA11 = ygpVar.a();
                                    C.b.c(bArrC11, 0, iA11);
                                    long j110 = iA11;
                                    atomicLong.addAndGet(j110);
                                    C.k.addAndGet(j110);
                                    if (this.d) {
                                        C.b(false);
                                        if (this.e) {
                                            elqVar = this.g;
                                            str16 = this.m;
                                            agqjVar = new agqj(this.h);
                                            elqVar.F(str16, agqjVar);
                                        }
                                        this.k.remove(this.b);
                                    }
                                } else if (this.d) {
                                    C.b(false);
                                    if (this.e) {
                                        elqVar = this.g;
                                        str16 = this.m;
                                        agqjVar = new agqj(this.h);
                                        elqVar.F(str16, agqjVar);
                                    }
                                    this.k.remove(this.b);
                                }
                            }
                        }
                    } else if (this.d) {
                        C.b(false);
                        if (this.e) {
                            elqVar = this.g;
                            str16 = this.m;
                            agqjVar = new agqj(this.h);
                            elqVar.F(str16, agqjVar);
                        }
                        this.k.remove(this.b);
                    }
                }
            } catch (RuntimeException e13) {
                c(e13, "createWriter");
            }
            this.l.b();
        } catch (Throwable th6) {
            this.l.b();
            throw th6;
        }
    }
}
