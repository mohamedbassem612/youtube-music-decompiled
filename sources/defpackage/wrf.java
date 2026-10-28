package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrf extends wlu {
    private final mbc D;
    public String a;
    public long b;
    public akku c;
    public alow d;
    public List e;

    public wrf(abxv abxvVar, zwa zwaVar, String str, boolean z, boolean z2, mbc mbcVar, boolean z3) {
        super(abxvVar, zwaVar, z, str, Boolean.valueOf(z2));
        this.a = "";
        this.b = 0L;
        this.e = new ArrayList();
        m();
        this.D = mbcVar;
        this.l = z3;
    }

    public final void F(alou alouVar) {
        this.e.add(alouVar);
    }

    public final void G(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final aihf a() {
        aihf aihfVarCreateBuilder = alow.a.createBuilder();
        aihfVarCreateBuilder.be(this.e);
        long epochMilli = this.D.f().toEpochMilli();
        aihfVarCreateBuilder.copyOnWrite();
        alow alowVar = (alow) aihfVarCreateBuilder.instance;
        alowVar.b |= 2;
        alowVar.d = epochMilli;
        aihf aihfVarCreateBuilder2 = alpa.a.createBuilder();
        long j = this.b;
        if (j != 0) {
            aihfVarCreateBuilder2.copyOnWrite();
            alpa alpaVar = (alpa) aihfVarCreateBuilder2.instance;
            alpaVar.b |= 2;
            alpaVar.d = j;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVarCreateBuilder2.copyOnWrite();
            alpa alpaVar2 = (alpa) aihfVarCreateBuilder2.instance;
            str.getClass();
            alpaVar2.b |= 1;
            alpaVar2.c = str;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alow alowVar2 = (alow) aihfVarCreateBuilder.instance;
        alpa alpaVar3 = (alpa) aihfVarCreateBuilder2.build();
        alpaVar3.getClass();
        alowVar2.e = alpaVar3;
        alowVar2.b |= 4;
        akku akkuVar = this.c;
        if (akkuVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alow alowVar3 = (alow) aihfVarCreateBuilder.instance;
            alowVar3.g = akkuVar.f;
            alowVar3.b |= 32;
        }
        alow alowVar4 = this.d;
        if (alowVar4 != null) {
            aihfVarCreateBuilder.mergeFrom((aihn) alowVar4);
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!e());
    }

    public final boolean e() {
        return this.e.isEmpty();
    }
}
