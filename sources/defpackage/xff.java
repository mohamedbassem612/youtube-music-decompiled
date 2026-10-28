package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class xff extends zug {
    public Object e;
    public alot f;
    public long g;
    public long h;
    public int i;
    private final ajij r;

    public xff(Object obj, alot alotVar, zup zupVar, zta ztaVar) {
        super(zupVar, ztaVar);
        this.r = ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN;
        this.e = obj;
        this.f = alotVar;
        this.g = Long.MAX_VALUE;
        this.i = 1;
    }

    private static final void d(alos alosVar, alot alotVar, aihn aihnVar) {
        byte[] bArr = new byte[aihnVar.getSerializedSize() + 16];
        aigs aigsVarO = aigs.O(bArr);
        try {
            aigsVarO.q(alotVar.jH, aihnVar);
            try {
                alosVar.mo59mergeFrom(bArr, 0, aigsVarO.b(), ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik e) {
                throw new agfz(e);
            }
        } catch (IOException e2) {
            throw new agfz(e2);
        }
    }

    @Override // defpackage.zug
    public /* bridge */ /* synthetic */ zug a(String str) {
        g(str);
        return this;
    }

    @Override // defpackage.zug
    public /* bridge */ /* synthetic */ zug b(String str) {
        h(str);
        return this;
    }

    @Override // defpackage.zug
    protected aigj c() {
        alos alosVar;
        zta ztaVar = this.k;
        xet xetVar = (xet) ztaVar.f;
        Object obj = this.e;
        if (a$$ExternalSyntheticApiModelOutline0.m15m(obj) && (obj = a$$ExternalSyntheticApiModelOutline0.m10m(obj).get()) == null) {
            return null;
        }
        if (obj instanceof alos) {
            alosVar = (alos) obj;
        } else if (obj instanceof alou) {
            alosVar = (alos) ((alou) obj).toBuilder();
        } else {
            alos alosVar2 = (alos) alou.a.createBuilder();
            if (a$$ExternalSyntheticApiModelOutline0.m$1(obj)) {
                a$$ExternalSyntheticApiModelOutline0.m7m(obj).r(alosVar2);
            } else if (ie$$ExternalSyntheticApiModelOutline0.m835m(obj)) {
                alosVar = (alos) a$$ExternalSyntheticApiModelOutline0.m8m(obj).apply(alosVar2);
            } else if (obj instanceof aihf) {
                d(alosVar2, this.f, ((aihf) obj).build());
            } else {
                if (!(obj instanceof aihn)) {
                    throw new agfz("Not implemented");
                }
                d(alosVar2, this.f, (aihn) obj);
            }
            alosVar = alosVar2;
        }
        alov alovVar = ((alou) alosVar.instance).f;
        if (alovVar == null) {
            alovVar = alov.a;
        }
        aihf builder = alovVar.toBuilder();
        long jB = this.g;
        if (jB == Long.MAX_VALUE) {
            alov alovVar2 = (alov) builder.instance;
            if ((alovVar2.b & 1) != 0) {
                jB = alovVar2.c;
                this.g = jB;
            } else {
                jB = xetVar.b(this.l);
                this.g = jB;
            }
        }
        if (jB < 0) {
            jB = -1;
        }
        builder.copyOnWrite();
        alov alovVar3 = (alov) builder.instance;
        alovVar3.b |= 1;
        alovVar3.c = jB;
        int i = this.i;
        if (i != 1) {
            if (i == 2) {
                aihf aihfVarCreateBuilder = aoky.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aoky aokyVar = (aoky) aihfVarCreateBuilder.instance;
                aokyVar.b |= 1;
                aokyVar.c = true;
                builder.copyOnWrite();
                alov alovVar4 = (alov) builder.instance;
                aoky aokyVar2 = (aoky) aihfVarCreateBuilder.build();
                aokyVar2.getClass();
                alovVar4.e = aokyVar2;
                alovVar4.b |= 8;
            }
        } else if (ztaVar instanceof xeu) {
        }
        ajij ajijVar = this.r;
        if (ajijVar != ajij.AUTOMATED_LOG_EVENT_SOURCE_UNKNOWN) {
            builder.copyOnWrite();
            alov alovVar5 = (alov) builder.instance;
            alovVar5.f = ajijVar.k;
            alovVar5.b |= 16;
        }
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        alov alovVar6 = (alov) builder.build();
        alovVar6.getClass();
        alouVar.f = alovVar6;
        alouVar.b |= 2;
        long j = this.h;
        if (j <= 0) {
            j = ((alou) alosVar.instance).e;
        }
        if (j <= 0) {
            j = j();
        }
        long jI = i();
        if (j != jI) {
            long j2 = j - j();
            if (j2 > 50 || j2 < -2500) {
                jI = i();
            } else {
                this.m = j2;
                jI = j;
            }
        }
        if (j != jI) {
            alosVar.copyOnWrite();
            alou alouVar2 = (alou) alosVar.instance;
            alouVar2.b |= 1;
            alouVar2.e = j;
        } else {
            alosVar.copyOnWrite();
            alou alouVar3 = (alou) alosVar.instance;
            alouVar3.b &= -2;
            alouVar3.e = 0L;
        }
        return ((alou) alosVar.build()).toByteString();
    }

    @Override // defpackage.zug
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void e(boolean z) {
        this.p = z;
    }

    public void g(String str) {
        this.n = str;
    }

    public void h(String str) {
        this.o = str;
    }
}
