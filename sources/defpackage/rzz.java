package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzz implements rsq, aauy, sap {
    public final awmd a;
    public final awmd b;
    public final awmd c;
    public final awmd d;
    public final vyo e;
    public final awmd f;
    public abnr j;
    public final rmp k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final awmd o;
    private final awmd p;
    private final awmd q;
    private final awmd r;
    private final awmd s;
    public volatile rzy g = null;
    public AbstractMap.SimpleEntry h = null;
    public abob i = abob.a;
    private String t = "";
    private boolean u = false;

    public rzz(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, rmp rmpVar, vyo vyoVar, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13) {
        this.l = awmdVar;
        this.m = awmdVar2;
        this.a = awmdVar3;
        this.b = awmdVar4;
        this.c = awmdVar5;
        this.d = awmdVar6;
        this.n = awmdVar7;
        this.o = awmdVar8;
        this.p = awmdVar9;
        this.q = awmdVar10;
        this.k = rmpVar;
        this.e = vyoVar;
        this.f = awmdVar11;
        this.r = awmdVar12;
        this.s = awmdVar13;
    }

    public static alam b(skl sklVar) {
        for (aisv aisvVar : sklVar.b.b()) {
            if ((aisvVar.b & 2) != 0) {
                alam alamVar = aisvVar.d;
                return alamVar == null ? alam.a : alamVar;
            }
        }
        return null;
    }

    private static arci w(wjf wjfVar) {
        Iterator it = wjfVar.H().iterator();
        while (it.hasNext()) {
            for (aisv aisvVar : ((aisu) it.next()).e) {
                if ((aisvVar.b & 32) != 0) {
                    arci arciVar = aisvVar.f;
                    return arciVar == null ? arci.a : arciVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.sap
    public final void X(smr smrVar) {
        aqi aqiVar;
        int i = sdi.a;
        if (smrVar == null || !smrVar.e(sjg.class) || (aqiVar = (aqi) smrVar.d(sjg.class)) == null) {
            return;
        }
        aqiVar.b(null);
    }

    @Override // defpackage.rsq
    public final void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
        this.j = abnrVar;
    }

    @Override // defpackage.rsq
    public final void av() {
        throw null;
    }

    @Override // defpackage.aauy
    public final Optional c(wjf wjfVar, acfw acfwVar, String str) {
        sdh sdhVar;
        sgv sgvVar = (sgv) this.q.io();
        spv spvVar = (spv) this.r.io();
        rug rugVar = (rug) this.s.io();
        rzw rzwVar = new rzw(this, wjfVar, acfwVar, str);
        int i = sdi.a;
        vyo vyoVar = this.e;
        boolean zAo = taq.ao(vyoVar);
        int i2 = 0;
        boolean z = sdi.d(vyoVar, wjfVar) && sdi.a(wjfVar);
        boolean z2 = zAo && sdi.b(wjfVar);
        int i3 = 2;
        if (wjfVar.R() || !(z2 || z)) {
            sdhVar = sdh.a;
        } else {
            aivp aivpVarP = wjfVar.p();
            if (aivpVarP != null) {
                sgvVar.a(aivpVarP);
            }
            if (!sdi.a(wjfVar) || sdi.e(wjfVar)) {
                sdhVar = new sdh(Optional.empty(), new rzt(rzwVar, 3));
            } else if (z2) {
                AtomicReference atomicReference = new AtomicReference();
                sdhVar = new sdh(Optional.of(ahbz.e(ape.f(new sdf(atomicReference, i2)), Exception.class, afwl.a(new rmk(17)), MoreExecutors.directExecutor())), new sdg(rzwVar, atomicReference, vyoVar, spvVar, str, wjfVar, 0));
            } else {
                AtomicReference atomicReference2 = new AtomicReference();
                sdhVar = new sdh(Optional.empty(), new sdg(rzwVar, atomicReference2, new AtomicBoolean(false), rugVar, acfwVar, ape.f(new sdf(atomicReference2, i3)), 2));
            }
        }
        Supplier supplier = sdhVar.c;
        if (supplier == null) {
            return Optional.empty();
        }
        this.t = r6;
        this.u = false;
        ((roq) this.m.io()).f(2, skh.a(str, wjfVar), supplier);
        return sdhVar.b;
    }

    @Override // defpackage.rsq
    public final void l(abob abobVar, final wjf wjfVar, final acfw acfwVar, final String str, String str2) {
        this.i = abobVar;
        int iOrdinal = abobVar.ordinal();
        if (iOrdinal == 0) {
            this.t = null;
            this.u = false;
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 8 && !TextUtils.isEmpty(this.t) && TextUtils.equals(str, this.t)) {
                if (!this.u) {
                    acga acgaVarG = acfwVar.g();
                    if (acgaVarG != null) {
                        awmd awmdVar = this.o;
                        acgaVarG.w((zdj) awmdVar.io());
                        acgaVarG.v((zdj) awmdVar.io());
                    }
                    ((roq) this.m.io()).f(7, skh.a(str, wjfVar), new Supplier() { // from class: rzx
                        /* JADX WARN: Code duplicated, block: B:116:0x02e8 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:119:0x02fc A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:123:0x0318 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:125:0x0328  */
                        /* JADX WARN: Code duplicated, block: B:126:0x032c A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:128:0x0330 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:133:0x034a  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0361 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:141:0x0369 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:144:0x0372 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:155:0x0397  */
                        /* JADX WARN: Code duplicated, block: B:159:0x03ac A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:161:0x03c2 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:162:0x03c6 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:164:0x03ce  */
                        /* JADX WARN: Code duplicated, block: B:168:0x03dc A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:172:0x03ee A[Catch: RuntimeException -> 0x063a, LOOP:5: B:171:0x03ec->B:172:0x03ee, LOOP_END, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:175:0x0453 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:177:0x0464 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:183:0x04a9  */
                        /* JADX WARN: Code duplicated, block: B:186:0x04b7 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:188:0x04f2 A[Catch: RuntimeException -> 0x063a, LOOP:7: B:187:0x04f0->B:188:0x04f2, LOOP_END, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:191:0x0504 A[Catch: RuntimeException -> 0x063a, LOOP:8: B:190:0x0502->B:191:0x0504, LOOP_END, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:194:0x052a A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:195:0x052c  */
                        /* JADX WARN: Code duplicated, block: B:197:0x0531 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:200:0x0544  */
                        /* JADX WARN: Code duplicated, block: B:201:0x0547 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:204:0x0555 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:206:0x0568 A[Catch: RuntimeException -> 0x063a, LOOP:10: B:205:0x0566->B:206:0x0568, LOOP_END, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:208:0x0599  */
                        /* JADX WARN: Code duplicated, block: B:213:0x05b7 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:215:0x05cc  */
                        /* JADX WARN: Code duplicated, block: B:218:0x05d3 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:220:0x05e1 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:222:0x05e9 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:224:0x05f3 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:228:0x0611 A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:230:0x061b A[Catch: RuntimeException -> 0x063a, TryCatch #1 {RuntimeException -> 0x063a, blocks: (B:114:0x02d8, B:116:0x02e8, B:117:0x02f3, B:119:0x02fc, B:121:0x030c, B:123:0x0318, B:134:0x034c, B:126:0x032c, B:128:0x0330, B:130:0x033c, B:132:0x0346, B:139:0x0361, B:141:0x0369, B:142:0x036c, B:144:0x0372, B:145:0x0375, B:156:0x039b, B:157:0x03a6, B:159:0x03ac, B:161:0x03c2, B:162:0x03c6, B:168:0x03dc, B:170:0x03e2, B:172:0x03ee, B:173:0x044b, B:175:0x0453, B:177:0x0464, B:179:0x046a, B:181:0x0471, B:182:0x049c, B:186:0x04b7, B:188:0x04f2, B:189:0x04fe, B:191:0x0504, B:192:0x0517, B:198:0x053e, B:202:0x0551, B:204:0x0555, B:206:0x0568, B:209:0x059d, B:201:0x0547, B:197:0x0531, B:211:0x05af, B:213:0x05b7, B:216:0x05cd, B:218:0x05d3, B:220:0x05e1, B:222:0x05e9, B:224:0x05f3, B:226:0x0609, B:228:0x0611, B:230:0x061b, B:232:0x0626, B:234:0x062d, B:235:0x0630, B:236:0x0633, B:237:0x0636), top: B:245:0x02d8 }] */
                        /* JADX WARN: Code duplicated, block: B:257:0x035b A[EDGE_INSN: B:257:0x035b->B:137:0x035b BREAK  A[LOOP:2: B:117:0x02f3->B:260:0x02f3], SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:258:0x0358 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:259:0x030c A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:272:0x03cf A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:282:0x0609 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:284:0x0630 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:285:0x0630 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:288:0x062d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v25 */
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            List list;
                            int i;
                            smr smrVar;
                            acfw acfwVar2;
                            List list2;
                            wjf wjfVar2;
                            long jA;
                            Random random;
                            ArrayList arrayList;
                            Iterator it;
                            smr smrVar2;
                            long j;
                            rzz rzzVar;
                            String str3;
                            long j2;
                            long jAa;
                            rzz rzzVar2;
                            String str4;
                            ArrayList arrayList2;
                            Iterator it2;
                            skl sklVar;
                            String str5;
                            long j3;
                            rzz rzzVar3;
                            float f;
                            ArrayList arrayList3;
                            ArrayList arrayList4;
                            long j4;
                            String str6;
                            ArrayList arrayList5;
                            rzz rzzVar4;
                            long jZ;
                            int i2;
                            agke agkeVar;
                            int i3;
                            int i4;
                            snk snkVar;
                            agke agkeVar2;
                            int i5;
                            int i6;
                            snk snkVar2;
                            rzz rzzVar5;
                            ArrayList arrayList6;
                            int size;
                            int i7;
                            int[] iArr;
                            ArrayList arrayList7;
                            String str7;
                            int i8;
                            int i9;
                            ArrayList arrayList8;
                            int i10;
                            long jA2;
                            long jA3;
                            int i11;
                            ArrayList arrayList9;
                            int[] iArr2;
                            long j5;
                            int[] iArr3;
                            double d;
                            int i12;
                            ArrayList arrayList10;
                            int size2;
                            int i13;
                            skl sklVar2;
                            smr smrVar3;
                            agke agkeVar3;
                            int i14;
                            int i15;
                            snk snkVar3;
                            String str8;
                            snh snhVar;
                            int i16;
                            smr smrVarB;
                            alam alamVarB;
                            smr smrVarX;
                            rzz rzzVar6 = this.a;
                            String str9 = str;
                            wjf wjfVar3 = wjfVar;
                            int i17 = -1;
                            int i18 = 1;
                            if (wjfVar3.R()) {
                                list = null;
                            } else {
                                Iterator it3 = wjfVar3.H().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        int iBi = a.bi(((aisu) it3.next()).f);
                                        if (iBi == 0) {
                                            iBi = 1;
                                        }
                                        int i19 = iBi - 1;
                                        if (i19 == 1 || i19 == 2 || i19 == 3 || i19 == 7) {
                                            AbstractMap.SimpleEntry simpleEntry = rzzVar6.h;
                                            List listA = (simpleEntry == null || !TextUtils.equals((CharSequence) simpleEntry.getKey(), str9)) ? null : (List) rzzVar6.h.getValue();
                                            rzzVar6.h = null;
                                            if (listA == null || listA.isEmpty()) {
                                                rmp.n(null, "Non-preroll adBreaks failed to be cached");
                                                listA = ((sdm) rzzVar6.a.io()).a(wjfVar3);
                                            }
                                            if (listA == null || listA.isEmpty()) {
                                                rmp.n(null, "Failed to directly build instreamAdBreaks even after caching fallback");
                                            } else {
                                                list = listA;
                                            }
                                        }
                                    }
                                    list = null;
                                }
                            }
                            if (list == null || list.isEmpty()) {
                                return null;
                            }
                            acfw acfwVar3 = acfwVar;
                            ArrayList arrayList11 = new ArrayList();
                            if (list.isEmpty() || ((skl) list.get(0)).b() != slm.PRE_ROLL || (alamVarB = rzz.b((skl) list.get(0))) == null) {
                                i = 0;
                                i17 = -1;
                                smrVar = null;
                                acfwVar2 = acfwVar3;
                                list2 = arrayList11;
                                wjfVar2 = wjfVar3;
                            } else {
                                aaok aaokVar = (aaok) rzzVar6.c.io();
                                skl sklVar3 = (skl) list.get(0);
                                Optional optionalOf = Optional.of(((skl) list.get(0)).b);
                                if (taq.ad((vyo) aaokVar.c)) {
                                    smrVar = null;
                                    smrVarX = aaokVar.af(str9, acfwVar3, sklVar3, optionalOf, new snh(aaok.ak(sklVar3), aaok.ak(null)));
                                    str9 = str9;
                                    acfwVar2 = acfwVar3;
                                    list2 = arrayList11;
                                    i = 0;
                                    wjfVar2 = wjfVar3;
                                } else {
                                    smrVar = null;
                                    list2 = arrayList11;
                                    i = 0;
                                    smrVarX = aaokVar.X(alamVarB, str9, acfwVar3, wjfVar3, sklVar3, optionalOf, new snh(aaok.ak(sklVar3), aaok.ak(null)), null);
                                    str9 = str9;
                                    acfwVar2 = acfwVar3;
                                    wjfVar2 = wjfVar3;
                                }
                                list2.add(smrVarX);
                            }
                            if (!list.isEmpty() && (list.size() != 1 || ((skl) list.get(i)).b() != slm.PRE_ROLL)) {
                                int i20 = ((skl) list.get(i)).b() == slm.PRE_ROLL ? 1 : i;
                                while (i20 < list.size()) {
                                    int i21 = i20 + 1;
                                    skl sklVar4 = (skl) list.get(i20);
                                    if (sklVar4.b() == slm.PAUSE && (sklVar4.a() == 0 || rzzVar6.v(sklVar4))) {
                                        awmd awmdVar2 = rzzVar6.c;
                                        smrVarB = ((aaok) awmdVar2.io()).Y(sklVar4, wjfVar2, acfwVar2, str9);
                                        if (rzzVar6.v(sklVar4)) {
                                            long jAa2 = taq.aa(rzzVar6.e);
                                            long jA4 = sklVar4.a();
                                            String str10 = str9;
                                            smrVarB = ((aaok) awmdVar2.io()).aa(str10, jA4, jAa2 + jA4, smrVarB);
                                            str9 = str10;
                                        }
                                        i18 = i18;
                                        list = list;
                                    } else {
                                        aaok aaokVar2 = (aaok) rzzVar6.c.io();
                                        skl sklVar5 = i20 == list.size() + (-1) ? smrVar : (skl) list.get(i21);
                                        Object obj = aaokVar2.d;
                                        aixo aixoVar = aixo.SLOT_TYPE_AD_BREAK_REQUEST;
                                        String strAa = ((xsc) obj).aa();
                                        List listAi = aaok.ai(str9, acfwVar2, wjfVar2, sklVar4.b());
                                        listAi.add(new sip(sklVar4));
                                        long jAk = aaok.ak(sklVar4);
                                        slm slmVarB = sklVar4.b();
                                        slm slmVar = slm.MID_ROLL;
                                        if (slmVarB != slmVar) {
                                            jAk = Duration.ofSeconds(wjfVar2.a()).toMillis();
                                        }
                                        long jMax = jAk;
                                        long millis = (sklVar5 == 0 || sklVar5.b() != slmVar) ? Duration.ofSeconds(wjfVar2.a()).toMillis() : sklVar5.a();
                                        String str11 = str9;
                                        long jMax2 = Math.max(0L, jMax - aaokVar2.V(sklVar4));
                                        if (!taq.aS((vyo) aaokVar2.c)) {
                                            jMax = Math.max(jMax, millis);
                                        }
                                        sdq sdqVarW = aaokVar2.W(strAa, str11, new snh(jMax2, jMax), true, true, false);
                                        str9 = str11;
                                        smrVarB = smr.b(strAa, aixoVar, 1, 1, sdqVarW.a, sdqVarW.b, sdqVarW.c, shh.a(listAi), aaok.ah(sklVar4));
                                    }
                                    list2.add(smrVarB);
                                    i20 = i21;
                                    i18 = i18;
                                    list = list;
                                }
                                int i22 = i18;
                                List list3 = list;
                                vyo vyoVar = rzzVar6.e;
                                if (taq.aL(vyoVar)) {
                                    long jA5 = afxw.e(vyoVar).bB;
                                    if (jA5 > 0) {
                                        abnr abnrVar = rzzVar6.j;
                                        if (taq.aq(vyoVar)) {
                                            alvt alvtVarU = wjfVar2.u();
                                            aixo aixoVar2 = aixo.SLOT_TYPE_PLAYER_BYTES;
                                            Optional optionalJ = nre.j(nre.d(alvtVarU, agke.q(aixoVar2)), agke.q(aixoVar2));
                                            if (optionalJ.isPresent()) {
                                                aizs aizsVar = ((aivt) optionalJ.get()).f;
                                                if (aizsVar == null) {
                                                    aizsVar = aizs.a;
                                                }
                                                if (aizsVar.b == 17) {
                                                    if (abnrVar == null) {
                                                        abnrVar = abnr.REMOTE;
                                                    }
                                                    int iOrdinal2 = abnrVar.ordinal();
                                                    if (iOrdinal2 != 0) {
                                                        i16 = 2;
                                                        if (iOrdinal2 != 2) {
                                                            i16 = i17;
                                                        }
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    if (taq.ah(vyoVar, i16)) {
                                                        jA5 += acfwVar2.a();
                                                        try {
                                                            jA = wjfVar2.a();
                                                            random = new Random();
                                                            if (taq.aL(vyoVar)) {
                                                                arrayList = new ArrayList();
                                                                it = list2.iterator();
                                                                smrVar2 = smrVar;
                                                                while (true) {
                                                                    j = 1000 * jA;
                                                                    if (it.hasNext()) {
                                                                        break;
                                                                    }
                                                                    smrVar3 = (smr) it.next();
                                                                    it = it;
                                                                    if (smrVar3.c() == aixo.SLOT_TYPE_AD_BREAK_REQUEST) {
                                                                        agkeVar3 = smrVar3.e;
                                                                        i14 = ((agpi) agkeVar3).d;
                                                                        rzz rzzVar7 = rzzVar6;
                                                                        i15 = 0;
                                                                        while (i15 < i14) {
                                                                            agke agkeVar4 = agkeVar3;
                                                                            snkVar3 = (snk) agkeVar3.get(i15);
                                                                            int i23 = i15;
                                                                            if (snkVar3 instanceof skf) {
                                                                                str8 = str9;
                                                                                smrVar2 = smrVar3;
                                                                            } else if (snkVar3 instanceof slk) {
                                                                                snhVar = ((slk) snkVar3).b;
                                                                                str8 = str9;
                                                                                if (snhVar.b > j && snhVar.a <= j - 30000) {
                                                                                    arrayList.add(smrVar3);
                                                                                }
                                                                            } else {
                                                                                str8 = str9;
                                                                            }
                                                                            i15 = i23 + 1;
                                                                            agkeVar3 = agkeVar4;
                                                                            str9 = str8;
                                                                        }
                                                                        rzzVar6 = rzzVar7;
                                                                    }
                                                                    rmp.j(smrVar, "Failed to process slots for watch while ads: ".concat(String.valueOf(e.getMessage())));
                                                                }
                                                                rzzVar = rzzVar6;
                                                                str3 = str9;
                                                                if (smrVar2 != null) {
                                                                    if (afxw.e(vyoVar).ba) {
                                                                        list2.remove(smrVar2);
                                                                    }
                                                                    if (taq.aR(vyoVar)) {
                                                                        list2.removeAll(arrayList);
                                                                    }
                                                                    j2 = afxw.e(vyoVar).aZ;
                                                                    jAa = taq.aa(vyoVar);
                                                                    if (jA5 > 0 || jAa <= 0) {
                                                                        rzzVar2 = rzzVar;
                                                                        str4 = str3;
                                                                        arrayList2 = new ArrayList();
                                                                        it2 = list3.iterator();
                                                                        sklVar = smrVar;
                                                                        while (it2.hasNext()) {
                                                                            String str12 = str4;
                                                                            sklVar2 = (skl) it2.next();
                                                                            Iterator it4 = it2;
                                                                            long j6 = jAa;
                                                                            if (sklVar2.b() == slm.MID_ROLL) {
                                                                                arrayList2.add(sklVar2);
                                                                            } else if (sklVar2.b() == slm.PAUSE) {
                                                                                sklVar = sklVar2;
                                                                            }
                                                                            it2 = it4;
                                                                            jAa = j6;
                                                                            str4 = str12;
                                                                            sklVar = sklVar;
                                                                        }
                                                                        str5 = str4;
                                                                        j3 = jAa;
                                                                        if (sklVar != 0 && taq.aM(vyoVar)) {
                                                                            arrayList10 = new ArrayList();
                                                                            size2 = arrayList.size();
                                                                            i13 = 0;
                                                                            while (i13 < size2) {
                                                                                smr smrVar4 = (smr) arrayList.get(i13);
                                                                                int i24 = size2;
                                                                                ArrayList arrayList12 = new ArrayList();
                                                                                rzz rzzVar8 = rzzVar2;
                                                                                arrayList12.add(new sis(sklVar));
                                                                                smr smrVarB2 = smr.b(smrVar4.a, smrVar4.c(), smrVar4.a(), smrVar4.c, smrVar4.d, smrVar4.e, smrVar4.f, shh.c(smrVar4.g, shh.a(arrayList12)), smrVar4.h);
                                                                                arrayList10.add(smrVarB2);
                                                                                list2.remove(smrVar4);
                                                                                list2.add(smrVarB2);
                                                                                i13++;
                                                                                size2 = i24;
                                                                                rzzVar2 = rzzVar8;
                                                                            }
                                                                        }
                                                                        rzzVar3 = rzzVar2;
                                                                        if (!arrayList2.isEmpty()) {
                                                                            f = afxw.e(vyoVar).bg;
                                                                            arrayList3 = new ArrayList();
                                                                            if (f >= 1.0f || !taq.aR(vyoVar)) {
                                                                                arrayList4 = arrayList2;
                                                                                j4 = j3;
                                                                                str6 = str5;
                                                                                arrayList5 = arrayList3;
                                                                                rzzVar4 = rzzVar3;
                                                                            } else {
                                                                                int size3 = arrayList2.size();
                                                                                int i25 = 0;
                                                                                while (i25 < size3) {
                                                                                    long jA6 = ((skl) arrayList2.get(i25)).a();
                                                                                    long j7 = j3;
                                                                                    ArrayList arrayList13 = arrayList2;
                                                                                    int i26 = size3;
                                                                                    String str13 = str5;
                                                                                    ArrayList arrayList14 = arrayList3;
                                                                                    rzz rzzVar9 = rzzVar3;
                                                                                    rzzVar9.t(arrayList14, str13, jA6, j7, j2, smrVar2);
                                                                                    i25++;
                                                                                    rzzVar3 = rzzVar9;
                                                                                    arrayList3 = arrayList14;
                                                                                    str5 = str13;
                                                                                    arrayList2 = arrayList13;
                                                                                    size3 = i26;
                                                                                    j3 = j7;
                                                                                }
                                                                                arrayList4 = arrayList2;
                                                                                j4 = j3;
                                                                                str6 = str5;
                                                                                arrayList5 = arrayList3;
                                                                                rzzVar4 = rzzVar3;
                                                                                f -= 1.0f;
                                                                            }
                                                                            if (f > 0.0f) {
                                                                                int i27 = afxw.e(vyoVar).be;
                                                                                int i28 = afxw.e(vyoVar).bf;
                                                                                rzzVar5 = rzzVar4;
                                                                                float size4 = arrayList4.size() * f;
                                                                                arrayList6 = arrayList5;
                                                                                int iMin = Math.min(Math.max(i28, (int) Math.ceil(size4)), i27);
                                                                                size = arrayList4.size() + 1;
                                                                                int i29 = iMin / size;
                                                                                i7 = iMin % size;
                                                                                iArr = new int[size];
                                                                                Arrays.fill(iArr, i29);
                                                                                arrayList7 = new ArrayList();
                                                                                str7 = str6;
                                                                                i8 = 0;
                                                                                while (i8 < size) {
                                                                                    int i30 = i8;
                                                                                    arrayList7.add(Integer.valueOf(i30));
                                                                                    i8 = i30 + 1;
                                                                                }
                                                                                Collections.shuffle(arrayList7, random);
                                                                                for (i9 = 0; i9 < i7; i9++) {
                                                                                    int iIntValue = ((Integer) arrayList7.get(i9)).intValue();
                                                                                    iArr[iIntValue] = iArr[iIntValue] + 1;
                                                                                }
                                                                                arrayList8 = arrayList4;
                                                                                j$.util.List.EL.sort(arrayList8, Comparator$CC.comparingLong(new cpt(10)));
                                                                                i10 = 0;
                                                                                while (i10 < size) {
                                                                                    if (i10 == 0) {
                                                                                        jA2 = 0;
                                                                                    } else {
                                                                                        jA2 = ((skl) arrayList8.get(i10 - 1)).a();
                                                                                    }
                                                                                    int i31 = size;
                                                                                    if (i10 == arrayList8.size()) {
                                                                                        jA3 = j;
                                                                                    } else {
                                                                                        jA3 = ((skl) arrayList8.get(i10)).a();
                                                                                    }
                                                                                    i11 = iArr[i10];
                                                                                    if (i11 > 0) {
                                                                                        j5 = j4;
                                                                                        iArr3 = iArr;
                                                                                        d = (jA3 - jA2) / ((double) (i11 + 1));
                                                                                        i12 = i22;
                                                                                        while (i12 <= i11) {
                                                                                            long j8 = jA2;
                                                                                            int i32 = i11;
                                                                                            long jRound = Math.round(jA2 + (((double) i12) * d));
                                                                                            int i33 = i12;
                                                                                            rzz rzzVar10 = rzzVar5;
                                                                                            ArrayList arrayList15 = arrayList6;
                                                                                            String str14 = str7;
                                                                                            long j9 = j5;
                                                                                            rzzVar10.t(arrayList15, str14, jRound, j9, j2, smrVar2);
                                                                                            str7 = str14;
                                                                                            j5 = j9;
                                                                                            iArr3 = iArr3;
                                                                                            arrayList6 = arrayList15;
                                                                                            i11 = i32;
                                                                                            rzzVar5 = rzzVar10;
                                                                                            i12 = i33 + 1;
                                                                                            jA2 = j8;
                                                                                        }
                                                                                        arrayList9 = arrayList6;
                                                                                        iArr2 = iArr3;
                                                                                        j4 = j5;
                                                                                    } else {
                                                                                        arrayList9 = arrayList6;
                                                                                        iArr2 = iArr;
                                                                                    }
                                                                                    rzzVar5 = rzzVar5;
                                                                                    str7 = str7;
                                                                                    i10++;
                                                                                    iArr = iArr2;
                                                                                    arrayList6 = arrayList9;
                                                                                    size = i31;
                                                                                }
                                                                                arrayList5 = arrayList6;
                                                                            }
                                                                            jZ = taq.Z(vyoVar);
                                                                            if (jZ > 0) {
                                                                                Collections.sort(arrayList5, Comparator$CC.comparing(new rxg(6)));
                                                                                if (arrayList5.size() > i22) {
                                                                                    i2 = 1;
                                                                                    while (i2 < arrayList5.size()) {
                                                                                        agkeVar = ((smr) arrayList5.get(i2)).e;
                                                                                        if (!agkeVar.isEmpty()) {
                                                                                            i3 = ((agpi) agkeVar).d;
                                                                                            for (i4 = 0; i4 < i3; i4++) {
                                                                                                snkVar = (snk) agkeVar.get(i4);
                                                                                                if (snkVar instanceof slk) {
                                                                                                    long j10 = ((slk) snkVar).b.a;
                                                                                                    int i34 = i2 - 1;
                                                                                                    agkeVar2 = ((smr) arrayList5.get(i34)).e;
                                                                                                    if (!agkeVar2.isEmpty()) {
                                                                                                        i5 = ((agpi) agkeVar2).d;
                                                                                                        for (i6 = 0; i6 < i5; i6++) {
                                                                                                            snkVar2 = (snk) agkeVar2.get(i6);
                                                                                                            if (!(snkVar2 instanceof slk) && j10 < ((slk) snkVar2).b.a + jZ) {
                                                                                                                arrayList5.remove(i2);
                                                                                                                i2 = i34;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i2++;
                                                                                    }
                                                                                }
                                                                            }
                                                                            list2.addAll(arrayList5);
                                                                        }
                                                                    } else {
                                                                        List list4 = list2;
                                                                        try {
                                                                            rzzVar.t(list4, str3, jA5, jAa, j2, smrVar2);
                                                                        } catch (RuntimeException e) {
                                                                            e = e;
                                                                            list2 = list4;
                                                                            rmp.j(smrVar, "Failed to process slots for watch while ads: ".concat(String.valueOf(e.getMessage())));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        jA = wjfVar2.a();
                                        random = new Random();
                                        if (taq.aL(vyoVar)) {
                                            arrayList = new ArrayList();
                                            it = list2.iterator();
                                            smrVar2 = smrVar;
                                            while (true) {
                                                j = 1000 * jA;
                                                if (it.hasNext()) {
                                                    break;
                                                    break;
                                                }
                                                smrVar3 = (smr) it.next();
                                                it = it;
                                                if (smrVar3.c() == aixo.SLOT_TYPE_AD_BREAK_REQUEST) {
                                                    agkeVar3 = smrVar3.e;
                                                    i14 = ((agpi) agkeVar3).d;
                                                    rzz rzzVar11 = rzzVar6;
                                                    i15 = 0;
                                                    while (i15 < i14) {
                                                        agke agkeVar5 = agkeVar3;
                                                        snkVar3 = (snk) agkeVar3.get(i15);
                                                        int i210 = i15;
                                                        if (snkVar3 instanceof skf) {
                                                            str8 = str9;
                                                            smrVar2 = smrVar3;
                                                        } else if (snkVar3 instanceof slk) {
                                                            snhVar = ((slk) snkVar3).b;
                                                            str8 = str9;
                                                            if (snhVar.b > j) {
                                                            }
                                                        } else {
                                                            str8 = str9;
                                                        }
                                                        i15 = i210 + 1;
                                                        agkeVar3 = agkeVar5;
                                                        str9 = str8;
                                                    }
                                                    rzzVar6 = rzzVar11;
                                                }
                                                rmp.j(smrVar, "Failed to process slots for watch while ads: ".concat(String.valueOf(e.getMessage())));
                                            }
                                            rzzVar = rzzVar6;
                                            str3 = str9;
                                            if (smrVar2 != null) {
                                                if (afxw.e(vyoVar).ba) {
                                                    list2.remove(smrVar2);
                                                }
                                                if (taq.aR(vyoVar)) {
                                                    list2.removeAll(arrayList);
                                                }
                                                j2 = afxw.e(vyoVar).aZ;
                                                jAa = taq.aa(vyoVar);
                                                if (jA5 > 0) {
                                                    rzzVar2 = rzzVar;
                                                    str4 = str3;
                                                    arrayList2 = new ArrayList();
                                                    it2 = list3.iterator();
                                                    sklVar = smrVar;
                                                    while (it2.hasNext()) {
                                                        String str15 = str4;
                                                        sklVar2 = (skl) it2.next();
                                                        Iterator it5 = it2;
                                                        long j11 = jAa;
                                                        if (sklVar2.b() == slm.MID_ROLL) {
                                                            arrayList2.add(sklVar2);
                                                        } else if (sklVar2.b() == slm.PAUSE) {
                                                            sklVar = sklVar2;
                                                        }
                                                        it2 = it5;
                                                        jAa = j11;
                                                        str4 = str15;
                                                        sklVar = sklVar;
                                                    }
                                                    str5 = str4;
                                                    j3 = jAa;
                                                    if (sklVar != 0) {
                                                        arrayList10 = new ArrayList();
                                                        size2 = arrayList.size();
                                                        i13 = 0;
                                                        while (i13 < size2) {
                                                            smr smrVar5 = (smr) arrayList.get(i13);
                                                            int i211 = size2;
                                                            ArrayList arrayList16 = new ArrayList();
                                                            rzz rzzVar12 = rzzVar2;
                                                            arrayList16.add(new sis(sklVar));
                                                            smr smrVarB3 = smr.b(smrVar5.a, smrVar5.c(), smrVar5.a(), smrVar5.c, smrVar5.d, smrVar5.e, smrVar5.f, shh.c(smrVar5.g, shh.a(arrayList16)), smrVar5.h);
                                                            arrayList10.add(smrVarB3);
                                                            list2.remove(smrVar5);
                                                            list2.add(smrVarB3);
                                                            i13++;
                                                            size2 = i211;
                                                            rzzVar2 = rzzVar12;
                                                        }
                                                    }
                                                    rzzVar3 = rzzVar2;
                                                    if (!arrayList2.isEmpty()) {
                                                        f = afxw.e(vyoVar).bg;
                                                        arrayList3 = new ArrayList();
                                                        if (f >= 1.0f) {
                                                            arrayList4 = arrayList2;
                                                            j4 = j3;
                                                            str6 = str5;
                                                            arrayList5 = arrayList3;
                                                            rzzVar4 = rzzVar3;
                                                        } else {
                                                            arrayList4 = arrayList2;
                                                            j4 = j3;
                                                            str6 = str5;
                                                            arrayList5 = arrayList3;
                                                            rzzVar4 = rzzVar3;
                                                        }
                                                        if (f > 0.0f) {
                                                            int i212 = afxw.e(vyoVar).be;
                                                            int i213 = afxw.e(vyoVar).bf;
                                                            rzzVar5 = rzzVar4;
                                                            float size5 = arrayList4.size() * f;
                                                            arrayList6 = arrayList5;
                                                            int iMin2 = Math.min(Math.max(i213, (int) Math.ceil(size5)), i212);
                                                            size = arrayList4.size() + 1;
                                                            int i214 = iMin2 / size;
                                                            i7 = iMin2 % size;
                                                            iArr = new int[size];
                                                            Arrays.fill(iArr, i214);
                                                            arrayList7 = new ArrayList();
                                                            str7 = str6;
                                                            i8 = 0;
                                                            while (i8 < size) {
                                                                int i35 = i8;
                                                                arrayList7.add(Integer.valueOf(i35));
                                                                i8 = i35 + 1;
                                                            }
                                                            Collections.shuffle(arrayList7, random);
                                                            while (i9 < i7) {
                                                                int iIntValue2 = ((Integer) arrayList7.get(i9)).intValue();
                                                                iArr[iIntValue2] = iArr[iIntValue2] + 1;
                                                            }
                                                            arrayList8 = arrayList4;
                                                            j$.util.List.EL.sort(arrayList8, Comparator$CC.comparingLong(new cpt(10)));
                                                            i10 = 0;
                                                            while (i10 < size) {
                                                                if (i10 == 0) {
                                                                    jA2 = 0;
                                                                } else {
                                                                    jA2 = ((skl) arrayList8.get(i10 - 1)).a();
                                                                }
                                                                int i36 = size;
                                                                if (i10 == arrayList8.size()) {
                                                                    jA3 = j;
                                                                } else {
                                                                    jA3 = ((skl) arrayList8.get(i10)).a();
                                                                }
                                                                i11 = iArr[i10];
                                                                if (i11 > 0) {
                                                                    j5 = j4;
                                                                    iArr3 = iArr;
                                                                    d = (jA3 - jA2) / ((double) (i11 + 1));
                                                                    i12 = i22;
                                                                    while (i12 <= i11) {
                                                                        long j12 = jA2;
                                                                        int i37 = i11;
                                                                        long jRound2 = Math.round(jA2 + (((double) i12) * d));
                                                                        int i38 = i12;
                                                                        rzz rzzVar13 = rzzVar5;
                                                                        ArrayList arrayList17 = arrayList6;
                                                                        String str16 = str7;
                                                                        long j13 = j5;
                                                                        rzzVar13.t(arrayList17, str16, jRound2, j13, j2, smrVar2);
                                                                        str7 = str16;
                                                                        j5 = j13;
                                                                        iArr3 = iArr3;
                                                                        arrayList6 = arrayList17;
                                                                        i11 = i37;
                                                                        rzzVar5 = rzzVar13;
                                                                        i12 = i38 + 1;
                                                                        jA2 = j12;
                                                                    }
                                                                    arrayList9 = arrayList6;
                                                                    iArr2 = iArr3;
                                                                    j4 = j5;
                                                                } else {
                                                                    arrayList9 = arrayList6;
                                                                    iArr2 = iArr;
                                                                }
                                                                rzzVar5 = rzzVar5;
                                                                str7 = str7;
                                                                i10++;
                                                                iArr = iArr2;
                                                                arrayList6 = arrayList9;
                                                                size = i36;
                                                            }
                                                            arrayList5 = arrayList6;
                                                        }
                                                        jZ = taq.Z(vyoVar);
                                                        if (jZ > 0) {
                                                            Collections.sort(arrayList5, Comparator$CC.comparing(new rxg(6)));
                                                            if (arrayList5.size() > i22) {
                                                                i2 = 1;
                                                                while (i2 < arrayList5.size()) {
                                                                    agkeVar = ((smr) arrayList5.get(i2)).e;
                                                                    if (!agkeVar.isEmpty()) {
                                                                        i3 = ((agpi) agkeVar).d;
                                                                        while (i4 < i3) {
                                                                            snkVar = (snk) agkeVar.get(i4);
                                                                            if (snkVar instanceof slk) {
                                                                                long j14 = ((slk) snkVar).b.a;
                                                                                int i39 = i2 - 1;
                                                                                agkeVar2 = ((smr) arrayList5.get(i39)).e;
                                                                                if (!agkeVar2.isEmpty()) {
                                                                                    i5 = ((agpi) agkeVar2).d;
                                                                                    while (i6 < i5) {
                                                                                        snkVar2 = (snk) agkeVar2.get(i6);
                                                                                        if (!(snkVar2 instanceof slk)) {
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i2++;
                                                                }
                                                            }
                                                        }
                                                        list2.addAll(arrayList5);
                                                    }
                                                } else {
                                                    rzzVar2 = rzzVar;
                                                    str4 = str3;
                                                    arrayList2 = new ArrayList();
                                                    it2 = list3.iterator();
                                                    sklVar = smrVar;
                                                    while (it2.hasNext()) {
                                                        String str17 = str4;
                                                        sklVar2 = (skl) it2.next();
                                                        Iterator it6 = it2;
                                                        long j15 = jAa;
                                                        if (sklVar2.b() == slm.MID_ROLL) {
                                                            arrayList2.add(sklVar2);
                                                        } else if (sklVar2.b() == slm.PAUSE) {
                                                            sklVar = sklVar2;
                                                        }
                                                        it2 = it6;
                                                        jAa = j15;
                                                        str4 = str17;
                                                        sklVar = sklVar;
                                                    }
                                                    str5 = str4;
                                                    j3 = jAa;
                                                    if (sklVar != 0) {
                                                        arrayList10 = new ArrayList();
                                                        size2 = arrayList.size();
                                                        i13 = 0;
                                                        while (i13 < size2) {
                                                            smr smrVar6 = (smr) arrayList.get(i13);
                                                            int i215 = size2;
                                                            ArrayList arrayList18 = new ArrayList();
                                                            rzz rzzVar14 = rzzVar2;
                                                            arrayList18.add(new sis(sklVar));
                                                            smr smrVarB4 = smr.b(smrVar6.a, smrVar6.c(), smrVar6.a(), smrVar6.c, smrVar6.d, smrVar6.e, smrVar6.f, shh.c(smrVar6.g, shh.a(arrayList18)), smrVar6.h);
                                                            arrayList10.add(smrVarB4);
                                                            list2.remove(smrVar6);
                                                            list2.add(smrVarB4);
                                                            i13++;
                                                            size2 = i215;
                                                            rzzVar2 = rzzVar14;
                                                        }
                                                    }
                                                    rzzVar3 = rzzVar2;
                                                    if (!arrayList2.isEmpty()) {
                                                        f = afxw.e(vyoVar).bg;
                                                        arrayList3 = new ArrayList();
                                                        if (f >= 1.0f) {
                                                            arrayList4 = arrayList2;
                                                            j4 = j3;
                                                            str6 = str5;
                                                            arrayList5 = arrayList3;
                                                            rzzVar4 = rzzVar3;
                                                        } else {
                                                            arrayList4 = arrayList2;
                                                            j4 = j3;
                                                            str6 = str5;
                                                            arrayList5 = arrayList3;
                                                            rzzVar4 = rzzVar3;
                                                        }
                                                        if (f > 0.0f) {
                                                            int i216 = afxw.e(vyoVar).be;
                                                            int i217 = afxw.e(vyoVar).bf;
                                                            rzzVar5 = rzzVar4;
                                                            float size6 = arrayList4.size() * f;
                                                            arrayList6 = arrayList5;
                                                            int iMin3 = Math.min(Math.max(i217, (int) Math.ceil(size6)), i216);
                                                            size = arrayList4.size() + 1;
                                                            int i218 = iMin3 / size;
                                                            i7 = iMin3 % size;
                                                            iArr = new int[size];
                                                            Arrays.fill(iArr, i218);
                                                            arrayList7 = new ArrayList();
                                                            str7 = str6;
                                                            i8 = 0;
                                                            while (i8 < size) {
                                                                int i310 = i8;
                                                                arrayList7.add(Integer.valueOf(i310));
                                                                i8 = i310 + 1;
                                                            }
                                                            Collections.shuffle(arrayList7, random);
                                                            while (i9 < i7) {
                                                                int iIntValue3 = ((Integer) arrayList7.get(i9)).intValue();
                                                                iArr[iIntValue3] = iArr[iIntValue3] + 1;
                                                            }
                                                            arrayList8 = arrayList4;
                                                            j$.util.List.EL.sort(arrayList8, Comparator$CC.comparingLong(new cpt(10)));
                                                            i10 = 0;
                                                            while (i10 < size) {
                                                                if (i10 == 0) {
                                                                    jA2 = 0;
                                                                } else {
                                                                    jA2 = ((skl) arrayList8.get(i10 - 1)).a();
                                                                }
                                                                int i311 = size;
                                                                if (i10 == arrayList8.size()) {
                                                                    jA3 = j;
                                                                } else {
                                                                    jA3 = ((skl) arrayList8.get(i10)).a();
                                                                }
                                                                i11 = iArr[i10];
                                                                if (i11 > 0) {
                                                                    j5 = j4;
                                                                    iArr3 = iArr;
                                                                    d = (jA3 - jA2) / ((double) (i11 + 1));
                                                                    i12 = i22;
                                                                    while (i12 <= i11) {
                                                                        long j16 = jA2;
                                                                        int i312 = i11;
                                                                        long jRound3 = Math.round(jA2 + (((double) i12) * d));
                                                                        int i313 = i12;
                                                                        rzz rzzVar15 = rzzVar5;
                                                                        ArrayList arrayList19 = arrayList6;
                                                                        String str18 = str7;
                                                                        long j17 = j5;
                                                                        rzzVar15.t(arrayList19, str18, jRound3, j17, j2, smrVar2);
                                                                        str7 = str18;
                                                                        j5 = j17;
                                                                        iArr3 = iArr3;
                                                                        arrayList6 = arrayList19;
                                                                        i11 = i312;
                                                                        rzzVar5 = rzzVar15;
                                                                        i12 = i313 + 1;
                                                                        jA2 = j16;
                                                                    }
                                                                    arrayList9 = arrayList6;
                                                                    iArr2 = iArr3;
                                                                    j4 = j5;
                                                                } else {
                                                                    arrayList9 = arrayList6;
                                                                    iArr2 = iArr;
                                                                }
                                                                rzzVar5 = rzzVar5;
                                                                str7 = str7;
                                                                i10++;
                                                                iArr = iArr2;
                                                                arrayList6 = arrayList9;
                                                                size = i311;
                                                            }
                                                            arrayList5 = arrayList6;
                                                        }
                                                        jZ = taq.Z(vyoVar);
                                                        if (jZ > 0) {
                                                            Collections.sort(arrayList5, Comparator$CC.comparing(new rxg(6)));
                                                            if (arrayList5.size() > i22) {
                                                                i2 = 1;
                                                                while (i2 < arrayList5.size()) {
                                                                    agkeVar = ((smr) arrayList5.get(i2)).e;
                                                                    if (!agkeVar.isEmpty()) {
                                                                        i3 = ((agpi) agkeVar).d;
                                                                        while (i4 < i3) {
                                                                            snkVar = (snk) agkeVar.get(i4);
                                                                            if (snkVar instanceof slk) {
                                                                                long j18 = ((slk) snkVar).b.a;
                                                                                int i314 = i2 - 1;
                                                                                agkeVar2 = ((smr) arrayList5.get(i314)).e;
                                                                                if (!agkeVar2.isEmpty()) {
                                                                                    i5 = ((agpi) agkeVar2).d;
                                                                                    while (i6 < i5) {
                                                                                        snkVar2 = (snk) agkeVar2.get(i6);
                                                                                        if (!(snkVar2 instanceof slk)) {
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i2++;
                                                                }
                                                            }
                                                        }
                                                        list2.addAll(arrayList5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return list2;
                        }
                    });
                }
                this.u = true;
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.t, str) || wjfVar == null || acfwVar == null) {
            return;
        }
        vyo vyoVar = this.e;
        if (taq.ao(vyoVar) && sdi.b(wjfVar)) {
            return;
        }
        if (sdi.d(vyoVar, wjfVar) && sdi.a(wjfVar)) {
            c(wjfVar, acfwVar, str);
            return;
        }
        this.t = str;
        this.u = false;
        aivp aivpVarP = wjfVar.p();
        if (aivpVarP != null) {
            ((sgv) this.q.io()).a(aivpVarP);
        }
        ((roq) this.m.io()).f(2, skh.a(str, wjfVar), new rzo(this, wjfVar, acfwVar, str, 2));
    }

    /* JADX WARN: Code duplicated, block: B:88:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0407 A[LOOP:0: B:89:0x0405->B:90:0x0407, LOOP_END] */
    final List s(wjf wjfVar, acfw acfwVar, String str, aqi aqiVar) {
        List listA;
        agke agkeVarD;
        wjf wjfVar2;
        int i;
        aixo aixoVar;
        int i2;
        agke agkeVarG;
        agke agkeVar;
        aaok aaokVar;
        int size;
        int i3;
        String str2 = str;
        List listH = wjfVar.H();
        alvt alvtVarU = wjfVar.u();
        aixo aixoVar2 = aixo.SLOT_TYPE_PLAYER_BYTES;
        agke agkeVarD2 = nre.d(alvtVarU, agke.q(aixoVar2));
        int i4 = 1;
        if ((!listH.isEmpty() && Collection.EL.stream(listH).flatMap(new rxg(7)).anyMatch(new sde(i4))) || !agkeVarD2.isEmpty()) {
            run runVar = (run) this.p.io();
            runVar.a.c(new sft());
            if (runVar.b.isPresent()) {
                xir xirVar = (xir) runVar.b.get();
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amiuVar.b |= 524288;
                amiuVar.q = true;
                xirVar.h((amiu) aihfVarCreateBuilder.build());
                ((xir) runVar.b.get()).n("ad_i");
            }
        }
        ArrayList arrayList = new ArrayList();
        if (w(wjfVar) == null) {
            rzy rzyVar = this.g;
            this.g = null;
            if (rzyVar != null && rzyVar.b) {
                awmd awmdVar = this.n;
                if (((aboi) awmdVar.io()).m() && !((aboi) awmdVar.io()).l()) {
                    rzyVar = null;
                }
            }
            if ((!wjfVar.R() && wjfVar.H().isEmpty() && nre.d(wjfVar.u(), agke.q(aixoVar2)).isEmpty()) || sdi.e(wjfVar) || wjfVar.R()) {
                wjfVar2 = wjfVar;
            } else {
                boolean z = rzyVar != null;
                if (z) {
                    listA = rzyVar.c;
                    agkeVarD = rzyVar.d;
                } else {
                    listA = ((sdm) this.a.io()).a(wjfVar);
                    agkeVarD = nre.d(wjfVar.u(), agke.q(aixoVar2));
                }
                this.h = new AbstractMap.SimpleEntry(str2, listA);
                Optional optionalJ = nre.j(agkeVarD, agke.q(aixoVar2));
                if (optionalJ.isPresent()) {
                    wjfVar2 = wjfVar;
                    arrayList.add(((aaok) this.c.io()).Z((aivt) optionalJ.get(), str2, wjfVar, acfwVar, Optional.ofNullable(z ? rzyVar.f : null), Optional.empty(), Optional.empty(), Optional.ofNullable(this.j), aqiVar));
                } else {
                    wjfVar2 = wjfVar;
                    if (!listA.isEmpty()) {
                        if (((skl) listA.get(0)).b() != slm.PRE_ROLL) {
                            acfwVar = acfwVar;
                            str2 = str2;
                            i = 0;
                            aixoVar = aixoVar2;
                        } else if (b((skl) listA.get(0)) == null) {
                            aaok aaokVar2 = (aaok) this.c.io();
                            String strAa = z ? rzyVar.e : ((xsc) this.b.io()).aa();
                            skl sklVar = (skl) listA.get(0);
                            int size2 = ((skl) listA.get(0)).f().size();
                            sko skoVar = z ? rzyVar.f : null;
                            Optional optionalEmpty = Optional.empty();
                            acfwVar = acfwVar;
                            List listAi = aaok.ai(str2, acfwVar, wjfVar2, sklVar.b());
                            listAi.add(new sip(sklVar));
                            if (skoVar != null) {
                                listAi.add(new sjk(skoVar));
                            }
                            if (size2 > 1) {
                                listAi.add(new sht(Boolean.TRUE));
                            }
                            if (aqiVar != null) {
                                listAi.add(new sjg(aqiVar));
                            }
                            optionalEmpty.isPresent();
                            Object obj = aaokVar2.d;
                            aixr aixrVar = aixr.TRIGGER_TYPE_SLOT_ID_SCHEDULED;
                            xsc xscVar = (xsc) obj;
                            smy smyVar = new smy(xscVar.Z(aixrVar), aixrVar, false, strAa);
                            agjz agjzVar = new agjz(4);
                            aixr aixrVar2 = aixr.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED;
                            agjzVar.h(new slx(xscVar.Z(aixrVar2), aixrVar2, false, strAa));
                            aixr aixrVar3 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
                            agjzVar.h(new smv(xscVar.Z(aixrVar3), aixrVar3, false, strAa));
                            aixr aixrVar4 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                            slt sltVar = new slt(xscVar.Z(aixrVar4), aixrVar4, false, str, true);
                            str2 = str;
                            agjzVar.h(sltVar);
                            agke agkeVarQ = agke.q(smyVar);
                            agke agkeVarQ2 = agke.q(new smy(xscVar.Z(aixrVar), aixrVar, false, strAa));
                            if (taq.at((vyo) aaokVar2.c, wjfVar2.V(), wjfVar2.P(), true, false, false, false)) {
                                aixr aixrVar5 = aixr.TRIGGER_TYPE_ON_PLAYBACK_DESTROYED;
                                i2 = 0;
                                agjzVar.h(new slv(xscVar.Z(aixrVar5), aixrVar5, false, str2));
                                agkeVarG = agjzVar.g();
                            } else {
                                i2 = 0;
                                agkeVarG = agjzVar.g();
                            }
                            agke agkeVar2 = agkeVarG;
                            i = i2;
                            aixoVar = aixoVar2;
                            arrayList.add(smr.b(strAa, aixoVar, 1, 1, agkeVarQ, agkeVarQ2, agkeVar2, shh.a(listAi), aaok.ah(sklVar)));
                        }
                        if (taq.ar(this.e)) {
                            agkeVar = (agke) Collection.EL.stream(wjfVar2.u().n).map(new rxg(12)).filter(new sco(agke.q(aixoVar), 5)).filter(new sde(3)).collect(aghu.a);
                            aaokVar = (aaok) this.c.io();
                            size = agkeVar.size();
                            i3 = i;
                            while (i3 < size) {
                                int i5 = i3;
                                String str3 = str2;
                                aaok aaokVar3 = aaokVar;
                                arrayList.add(aaokVar3.Z((aivt) agkeVar.get(i3), str3, wjfVar2, acfwVar, Optional.empty(), Optional.empty(), Optional.empty(), Optional.ofNullable(this.j), null));
                                i3 = i5 + 1;
                                wjfVar2 = wjfVar;
                                acfwVar = acfwVar;
                                aaokVar = aaokVar3;
                                str2 = str;
                            }
                        }
                    }
                }
            }
            aixoVar = aixoVar2;
            i = 0;
            if (taq.ar(this.e)) {
                agkeVar = (agke) Collection.EL.stream(wjfVar2.u().n).map(new rxg(12)).filter(new sco(agke.q(aixoVar), 5)).filter(new sde(3)).collect(aghu.a);
                aaokVar = (aaok) this.c.io();
                size = agkeVar.size();
                i3 = i;
                while (i3 < size) {
                    int i6 = i3;
                    String str4 = str2;
                    aaok aaokVar4 = aaokVar;
                    arrayList.add(aaokVar4.Z((aivt) agkeVar.get(i3), str4, wjfVar2, acfwVar, Optional.empty(), Optional.empty(), Optional.empty(), Optional.ofNullable(this.j), null));
                    i3 = i6 + 1;
                    wjfVar2 = wjfVar;
                    acfwVar = acfwVar;
                    aaokVar = aaokVar4;
                    str2 = str;
                }
            }
        } else if (w(wjfVar) != null) {
            arci arciVarW = w(wjfVar);
            awmd awmdVar2 = this.c;
            Object obj2 = ((aaok) awmdVar2.io()).d;
            aixo aixoVar3 = aixo.SLOT_TYPE_PLAYBACK_TRACKING;
            xsc xscVar2 = (xsc) obj2;
            String strAa2 = xscVar2.aa();
            aixr aixrVar6 = aixr.TRIGGER_TYPE_BEFORE_CONTENT_VIDEO_ID_STARTED;
            agke agkeVarQ3 = agke.q(new she(xscVar2.Z(aixrVar6), aixrVar6, false, str2));
            aixr aixrVar7 = aixr.TRIGGER_TYPE_SLOT_ID_ENTERED;
            agke agkeVarQ4 = agke.q(new smu(xscVar2.Z(aixrVar7), aixrVar7, false, strAa2));
            aixr aixrVar8 = aixr.TRIGGER_TYPE_SLOT_ID_EXITED;
            arrayList.add(smr.i(strAa2, aixoVar3, agkeVarQ3, agkeVarQ4, agke.q(new smv(xscVar2.Z(aixrVar8), aixrVar8, false, strAa2)), shh.b(new sic(str2), new sid(wjfVar), new sht(arciVarW))));
            if (this.j != abnr.INLINE_IN_FEED) {
                alvt alvtVarU2 = wjfVar.u();
                if ((alvtVarU2.b & 16777216) != 0) {
                    aaok aaokVar5 = (aaok) awmdVar2.io();
                    aoqc aoqcVar = alvtVarU2.z;
                    if (aoqcVar == null) {
                        aoqcVar = aoqc.a;
                    }
                    Object obj3 = aaokVar5.d;
                    aixo aixoVar4 = aixo.SLOT_TYPE_BELOW_PLAYER;
                    xsc xscVar3 = (xsc) obj3;
                    String strAa3 = xscVar3.aa();
                    agke agkeVarQ5 = agke.q(new she(xscVar3.Z(aixrVar6), aixrVar6, false, str2));
                    agke agkeVarQ6 = agke.q(new smu(xscVar3.Z(aixrVar7), aixrVar7, false, strAa3));
                    aixr aixrVar9 = aixr.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID;
                    arrayList.add(smr.i(strAa3, aixoVar4, agkeVarQ5, agkeVarQ6, agke.r(new slt(xscVar3.Z(aixrVar9), aixrVar9, false, str2, false), new smv(xscVar3.Z(aixrVar8), aixrVar8, false, strAa3)), shh.b(new sid(wjfVar), new sji(aoqcVar))));
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public final void t(List list, String str, long j, long j2, long j3, smr smrVar) {
        if (j >= j3) {
            list.add(((aaok) this.c.io()).aa(str, j, j2 + j, smrVar));
        }
    }

    public final void u() {
        ((rut) this.l.io()).a.add(this);
    }

    public final boolean v(skl sklVar) {
        return sklVar.a() > 0 && taq.aL(this.e);
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void e(aaxa aaxaVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void h(aazs aazsVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
