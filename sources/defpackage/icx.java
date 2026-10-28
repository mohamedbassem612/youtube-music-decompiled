package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icx implements abjj {
    public final aunn a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ReentrantLock c = new ReentrantLock();
    public Optional d = Optional.empty();
    private final aunn e;
    private final aunn f;
    private final avmb g;
    private final mbc h;

    public icx(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, avmb avmbVar, mbc mbcVar) {
        this.e = aunnVar;
        this.a = aunnVar2;
        this.f = aunnVar3;
        this.g = avmbVar;
        this.h = mbcVar;
    }

    public final Optional a() {
        this.c.lock();
        try {
            return this.d;
        } finally {
            this.c.unlock();
        }
    }

    public final void b(int i) {
        hyz hyzVar = (hyz) ((abjp) this.a.io()).d(0).get(i);
        if (hyzVar != null) {
            c(hyzVar.t(), true, i);
        }
    }

    public final void c(String str, boolean z, int i) {
        if (this.b.get()) {
            agrx agrxVar = agso.a;
            return;
        }
        this.c.lock();
        try {
            aplb aplbVar = null;
            if (this.d.isPresent() && ((apla) this.d.get()).b.size() > 0) {
                aplbVar = (aplb) ((apla) this.d.get()).b.get(((apla) this.d.get()).b.size() - 1);
            }
            ReentrantLock reentrantLock = this.c;
            reentrantLock.unlock();
            if (aplbVar != null && aplbVar.e.equals(str)) {
                int i2 = aplbVar.c;
                if (z == (i2 == 5)) {
                    if ((!z) == (i2 == 4)) {
                        return;
                    }
                }
            }
            if (i < 0) {
                i = 0;
            }
            aihf aihfVarCreateBuilder = aplb.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aplb aplbVar2 = (aplb) aihfVarCreateBuilder.instance;
            str.getClass();
            aplbVar2.b |= 1;
            aplbVar2.e = str;
            aihfVarCreateBuilder.copyOnWrite();
            aplb aplbVar3 = (aplb) aihfVarCreateBuilder.instance;
            aplbVar3.b |= 2;
            aplbVar3.f = i;
            long epochMilli = this.h.f().toEpochMilli();
            aihfVarCreateBuilder.copyOnWrite();
            aplb aplbVar4 = (aplb) aihfVarCreateBuilder.instance;
            aplbVar4.b |= 4;
            aplbVar4.g = epochMilli;
            if (z) {
                apky apkyVar = apky.a;
                aihfVarCreateBuilder.copyOnWrite();
                aplb aplbVar5 = (aplb) aihfVarCreateBuilder.instance;
                apkyVar.getClass();
                aplbVar5.d = apkyVar;
                aplbVar5.c = 5;
            } else {
                apkz apkzVar = apkz.a;
                aihfVarCreateBuilder.copyOnWrite();
                aplb aplbVar6 = (aplb) aihfVarCreateBuilder.instance;
                apkzVar.getClass();
                aplbVar6.d = apkzVar;
                aplbVar6.c = 4;
            }
            reentrantLock.lock();
            try {
                aihf builder = this.d.isPresent() ? ((aihn) this.d.get()).toBuilder() : apla.a.createBuilder();
                aplb aplbVar7 = (aplb) aihfVarCreateBuilder.build();
                builder.copyOnWrite();
                apla aplaVar = (apla) builder.instance;
                aplbVar7.getClass();
                aiie aiieVar = aplaVar.b;
                if (!aiieVar.c()) {
                    aplaVar.b = aihn.mutableCopy(aiieVar);
                }
                aplaVar.b.add(aplbVar7);
                this.d = Optional.of((apla) builder.build());
            } finally {
                this.c.unlock();
            }
        } catch (Throwable th) {
            this.c.unlock();
            throw th;
        }
    }

    public final void e() {
        this.c.lock();
        try {
            this.d = Optional.empty();
        } finally {
            this.c.unlock();
        }
    }

    public final void f() {
        avmm avmmVar = new avmm();
        avlh avlhVarE = ((isi) this.f.io()).e();
        avmb avmbVar = this.g;
        avmmVar.c(avlhVarE.L(avmbVar).ak(new hxi(this, 19)));
        avmmVar.c(((abvn) this.e.io()).P().x(new hgu(14)).H(new hbz(16)).L(avmbVar).al(new hxi(this, 20), new hyx(13)));
        ((abjp) this.a.io()).q(this);
    }

    @Override // defpackage.abjj
    public final void ho(int i, int i2) {
        agrx agrxVar = agso.a;
        if (this.b.get() || i == -1 || i2 == -1 || i2 - i <= 1) {
            return;
        }
        b(i);
        int i3 = i + 1;
        agke agkeVar = (agke) Collection.EL.stream(((abjp) this.a.io()).d(0).subList(i3, i2)).map(new iaa(11)).collect(aghu.a);
        int size = agkeVar.size();
        int i4 = 0;
        while (i4 < size) {
            c((String) agkeVar.get(i4), false, i3);
            i4++;
            i3++;
        }
    }
}
