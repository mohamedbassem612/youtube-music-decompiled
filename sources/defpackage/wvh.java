package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvh extends wlu {
    public byte[] D;
    public long E;
    public amqw F;
    public CharSequence G;
    public aqoy H;
    public int I;
    public final List a;
    public String b;
    public String c;
    public String d;
    public String e;

    public wvh(abxv abxvVar, zwa zwaVar) {
        super("ypc/handle_transaction", abxvVar, zwaVar, 1, true, null, null);
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.D = vzh.a;
        this.E = -1L;
        this.F = amqw.a;
        this.G = "";
        this.I = 1;
        this.H = aqoy.a;
        this.a = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    @Override // defpackage.wkf
    protected final void b() {
        amap amapVar = (amap) a().build();
        typ.f(amapVar.d);
        int i = this.I;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                aqoy aqoyVar = amapVar.i;
                if (aqoyVar == null) {
                    aqoyVar = aqoy.a;
                }
                aqox aqoxVar = aqoyVar.c;
                if (aqoxVar == null) {
                    aqoxVar = aqox.a;
                }
                ajnr ajnrVar = aqoxVar.c;
                if (ajnrVar == null) {
                    ajnrVar = ajnr.a;
                }
                if ((ajnrVar.b & 2) == 0) {
                    z = false;
                }
            }
        }
        ahno.O(z);
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = amap.a.createBuilder();
        String str = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        amap amapVar = (amap) aihfVarCreateBuilder.instance;
        str.getClass();
        amapVar.b |= 2;
        amapVar.d = str;
        String str2 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        amap amapVar2 = (amap) aihfVarCreateBuilder.instance;
        str2.getClass();
        amapVar2.b |= 8;
        amapVar2.e = str2;
        String str3 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        amap amapVar3 = (amap) aihfVarCreateBuilder.instance;
        str3.getClass();
        amapVar3.b |= 16;
        amapVar3.f = str3;
        String str4 = this.e;
        aihfVarCreateBuilder.copyOnWrite();
        amap amapVar4 = (amap) aihfVarCreateBuilder.instance;
        str4.getClass();
        amapVar4.b |= 32;
        amapVar4.g = str4;
        aigj aigjVarV = aigj.v(this.D);
        aihfVarCreateBuilder.copyOnWrite();
        amap amapVar5 = (amap) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        amapVar5.b |= 64;
        amapVar5.h = aigjVarV;
        aqoy aqoyVar = this.H;
        aihfVarCreateBuilder.copyOnWrite();
        amap amapVar6 = (amap) aihfVarCreateBuilder.instance;
        aqoyVar.getClass();
        amapVar6.i = aqoyVar;
        amapVar6.b |= SemanticState.Hidden;
        List list = this.a;
        if (!list.isEmpty()) {
            aihfVarCreateBuilder.copyOnWrite();
            amap amapVar7 = (amap) aihfVarCreateBuilder.instance;
            aiie aiieVar = amapVar7.j;
            if (!aiieVar.c()) {
                amapVar7.j = aihn.mutableCopy(aiieVar);
            }
            aifs.addAll(list, amapVar7.j);
        }
        if (this.E != -1) {
            aole aoleVar = this.H.d;
            if (aoleVar == null) {
                aoleVar = aole.a;
            }
            aihf builder = aoleVar.toBuilder();
            long j = this.E;
            builder.copyOnWrite();
            aole aoleVar2 = (aole) builder.instance;
            aoleVar2.b |= 1;
            aoleVar2.e = j;
            aihf aihfVarCreateBuilder2 = ajnr.a.createBuilder();
            long j2 = this.E;
            aihfVarCreateBuilder2.copyOnWrite();
            ajnr ajnrVar = (ajnr) aihfVarCreateBuilder2.instance;
            ajnrVar.b |= 2;
            ajnrVar.f = j2;
            if (this.F.c.size() > 0) {
                amqw amqwVar = this.F;
                builder.copyOnWrite();
                aole aoleVar3 = (aole) builder.instance;
                amqwVar.getClass();
                aoleVar3.d = amqwVar;
                aoleVar3.c = 3;
                amqw amqwVar2 = this.F;
                aihfVarCreateBuilder2.copyOnWrite();
                ajnr ajnrVar2 = (ajnr) aihfVarCreateBuilder2.instance;
                amqwVar2.getClass();
                ajnrVar2.d = amqwVar2;
                ajnrVar2.c = 4;
            }
            if (!TextUtils.isEmpty(this.G)) {
                String string = this.G.toString();
                builder.copyOnWrite();
                aole aoleVar4 = (aole) builder.instance;
                string.getClass();
                aoleVar4.c = 2;
                aoleVar4.d = string;
                String string2 = this.G.toString();
                aihfVarCreateBuilder2.copyOnWrite();
                ajnr ajnrVar3 = (ajnr) aihfVarCreateBuilder2.instance;
                string2.getClass();
                ajnrVar3.c = 3;
                ajnrVar3.d = string2;
            }
            aihf builder2 = this.H.toBuilder();
            builder2.copyOnWrite();
            aqoy aqoyVar2 = (aqoy) builder2.instance;
            aole aoleVar5 = (aole) builder.build();
            aoleVar5.getClass();
            aqoyVar2.d = aoleVar5;
            aqoyVar2.b |= 4;
            aihf aihfVarCreateBuilder3 = aqox.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            aqox aqoxVar = (aqox) aihfVarCreateBuilder3.instance;
            ajnr ajnrVar4 = (ajnr) aihfVarCreateBuilder2.build();
            ajnrVar4.getClass();
            aqoxVar.c = ajnrVar4;
            aqoxVar.b |= 1;
            builder2.copyOnWrite();
            aqoy aqoyVar3 = (aqoy) builder2.instance;
            aqox aqoxVar2 = (aqox) aihfVarCreateBuilder3.build();
            aqoxVar2.getClass();
            aqoyVar3.c = aqoxVar2;
            aqoyVar3.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            amap amapVar8 = (amap) aihfVarCreateBuilder.instance;
            aqoy aqoyVar4 = (aqoy) builder2.build();
            aqoyVar4.getClass();
            amapVar8.i = aqoyVar4;
            amapVar8.b |= SemanticState.Hidden;
        }
        return aihfVarCreateBuilder;
    }
}
