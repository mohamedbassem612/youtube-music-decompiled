package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hix {
    public final ReentrantLock a;
    public String b;
    public final List c;
    private final aunn d;
    private final aunn e;
    private final avlh f;
    private final avmb g;
    private final avmm h;

    public hix(aunn aunnVar, aunn aunnVar2, avlh avlhVar, avmb avmbVar) {
        aunnVar.getClass();
        aunnVar2.getClass();
        avlhVar.getClass();
        avmbVar.getClass();
        this.d = aunnVar;
        this.e = aunnVar2;
        this.f = avlhVar;
        this.g = avmbVar;
        avmm avmmVar = new avmm();
        this.h = avmmVar;
        this.a = new ReentrantLock();
        this.c = new ArrayList();
        avmmVar.b();
        avmmVar.c(avlhVar.L(avmbVar).p().al(new gem(new agw(this, 13), 18), new gem(new bfu(8), 19)));
    }

    public final void a(hjz hjzVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.c.add(hjzVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(hjz hjzVar, String str) {
        awqg awqgVar;
        if (str == null || str.length() == 0) {
            ReentrantLock reentrantLock = this.a;
            reentrantLock.lock();
            try {
                String str2 = this.b;
                reentrantLock.unlock();
                str = str2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (str != null && str.length() != 0 && (awqgVar = hjzVar.c) != null) {
            awqgVar.invoke(str);
        }
        aihf aihfVarCreateBuilder = anae.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        int i = hjzVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        anae anaeVar = (anae) aihfVarCreateBuilder.instance;
        anaeVar.h = i - 1;
        anaeVar.b |= 32;
        anaf anafVar = hjzVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        anae anaeVar2 = (anae) aihfVarCreateBuilder.instance;
        anaeVar2.i = anafVar;
        anaeVar2.b |= 64;
        hjy hjyVar = hjzVar.b;
        zot zotVar = hjyVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        anae anaeVar3 = (anae) aihfVarCreateBuilder.instance;
        anaeVar3.b |= 1;
        String str3 = zotVar.b;
        anaeVar3.c = str3;
        amzo amzoVar = hjyVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        anae anaeVar4 = (anae) aihfVarCreateBuilder.instance;
        int i2 = amzoVar.l;
        anaeVar4.d = i2;
        anaeVar4.b |= 2;
        boolean zContains = ((hfy) this.d.io()).e.keySet().contains(str3);
        aihfVarCreateBuilder.copyOnWrite();
        anae anaeVar5 = (anae) aihfVarCreateBuilder.instance;
        anaeVar5.b |= 4;
        anaeVar5.e = zContains;
        zne zneVar = hjyVar.d;
        int i3 = zneVar.i();
        aihfVarCreateBuilder.copyOnWrite();
        anae anaeVar6 = (anae) aihfVarCreateBuilder.instance;
        anaeVar6.f = i3 - 1;
        anaeVar6.b |= 8;
        if (!anafVar.c && str != null && str.length() != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            anae anaeVar7 = (anae) aihfVarCreateBuilder.instance;
            anaeVar7.b |= 16;
            anaeVar7.g = str;
        }
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        alou alouVar = alou.a;
        alos alosVar = (alos) alouVar.createBuilder();
        alosVar.getClass();
        alosVar.copyOnWrite();
        alou alouVar2 = (alou) alosVar.instance;
        alouVar2.d = (anae) aihnVarBuild;
        alouVar2.c = 139;
        aunn aunnVar = this.e;
        ((xeu) aunnVar.io()).b(afxw.at(alosVar));
        if (anafVar.c || str == null || str.length() == 0) {
            return;
        }
        aihf aihfVarCreateBuilder2 = ambu.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihf aihfVarCreateBuilder3 = ambv.a.createBuilder();
        aihfVarCreateBuilder3.getClass();
        aihfVarCreateBuilder3.copyOnWrite();
        ambv ambvVar = (ambv) aihfVarCreateBuilder3.instance;
        ambvVar.b |= 1;
        ambvVar.c = str3;
        aihfVarCreateBuilder3.copyOnWrite();
        ambv ambvVar2 = (ambv) aihfVarCreateBuilder3.instance;
        ambvVar2.d = i2;
        ambvVar2.b |= 2;
        afyd.u(zneVar.i(), aihfVarCreateBuilder3);
        ambv ambvVarT = afyd.t(aihfVarCreateBuilder3);
        aihfVarCreateBuilder2.copyOnWrite();
        ambu ambuVar = (ambu) aihfVarCreateBuilder2.instance;
        ambuVar.c = ambvVarT;
        ambuVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        ambu ambuVar2 = (ambu) aihfVarCreateBuilder2.instance;
        ambuVar2.b |= 2;
        ambuVar2.d = str;
        aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
        aihnVarBuild2.getClass();
        alos alosVar2 = (alos) alouVar.createBuilder();
        alosVar2.getClass();
        alosVar2.copyOnWrite();
        alou alouVar3 = (alou) alosVar2.instance;
        alouVar3.d = (ambu) aihnVarBuild2;
        alouVar3.c = 556;
        ((xeu) aunnVar.io()).b(afxw.at(alosVar2));
    }
}
