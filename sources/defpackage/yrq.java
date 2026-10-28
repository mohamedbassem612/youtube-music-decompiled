package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yrq {
    public String a;
    public Duration b;
    public Optional c;
    public Optional d;
    public Optional e;
    public Optional f;
    public String g;
    public String h;
    public Integer i;
    public arfb j;
    public arie k;
    public aphs l;
    public boolean m;

    public yrq() {
        this.k = arie.a;
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.f = Optional.empty();
    }

    public final void a() {
        if (this.d.isPresent()) {
            anew anewVar = ((alik) this.d.get()).j;
            if (anewVar == null) {
                anewVar = anew.a;
            }
            aojp aojpVar = anewVar.c;
            if (aojpVar == null) {
                aojpVar = aojp.a;
            }
            if ((aojpVar.b & 536870912) != 0) {
                anew anewVar2 = ((alik) this.d.get()).j;
                if (anewVar2 == null) {
                    anewVar2 = anew.a;
                }
                aojp aojpVar2 = anewVar2.c;
                if (aojpVar2 == null) {
                    aojpVar2 = aojp.a;
                }
                this.g = aojpVar2.r;
            }
            anew anewVar3 = ((alik) this.d.get()).j;
            if (anewVar3 == null) {
                anewVar3 = anew.a;
            }
            aojp aojpVar3 = anewVar3.c;
            if (aojpVar3 == null) {
                aojpVar3 = aojp.a;
            }
            if ((aojpVar3.b & 1073741824) != 0) {
                anew anewVar4 = ((alik) this.d.get()).j;
                if (anewVar4 == null) {
                    anewVar4 = anew.a;
                }
                aojp aojpVar4 = anewVar4.c;
                if (aojpVar4 == null) {
                    aojpVar4 = aojp.a;
                }
                this.h = aojpVar4.s;
            }
        }
    }

    public final void b(alik alikVar) {
        this.d = Optional.of(alikVar);
    }

    public yrq(alik alikVar) {
        this();
        b(alikVar);
    }

    public yrq(aojt aojtVar) {
        this();
        this.c = Optional.of(aojtVar);
    }
}
