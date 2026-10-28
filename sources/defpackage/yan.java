package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yan {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/DefaultCastSdkClientAdapter");
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final wjr h;

    public yan(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, wjr wjrVar, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6) {
        this.b = aunnVar;
        this.c = aunnVar2;
        this.d = aunnVar3;
        this.h = wjrVar;
        this.e = aunnVar4;
        this.f = aunnVar5;
        this.g = aunnVar6;
    }

    public final Optional a() {
        Optional optionalB = b();
        return optionalB.isEmpty() ? Optional.empty() : Optional.of(((yae) optionalB.get()).aI());
    }

    public final Optional b() {
        yco ycoVar = ((ycp) this.b.io()).e;
        return Optional.ofNullable(ycoVar instanceof yae ? (yae) ycoVar : null);
    }
}
