package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ias {
    public String a;
    public String b;
    private aohs c;
    private int d;
    private float e;
    private byte f;

    private final void n() {
        if (this.c == null) {
            this.c = aohs.a;
        }
    }

    public final ajwo a() {
        aoht aohtVarC = c();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(aohu.a, aohtVarC);
        return (ajwo) aihhVar.build();
    }

    public final ajwo b() {
        aoht aohtVarC = c();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(aohu.a, aohtVarC);
        return (ajwo) aihhVar.build();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    public final aoht c() {
        ahno.G((TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.a)) ? false : true, "Both playlistId and videoId cannot be empty");
        ahno.G((e() ^ (-1)) >>> 31, "Index should not be negative");
        aihf aihfVarCreateBuilder = aoht.a.createBuilder();
        int iE = e();
        aihfVarCreateBuilder.copyOnWrite();
        aoht aohtVar = (aoht) aihfVarCreateBuilder.instance;
        aohtVar.b |= 4;
        aohtVar.e = iE;
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar2 = (aoht) aihfVarCreateBuilder.instance;
            aohtVar2.b |= 1;
            aohtVar2.c = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar3 = (aoht) aihfVarCreateBuilder.instance;
            aohtVar3.b |= 2;
            aohtVar3.d = str2;
        }
        aohs aohsVar = this.c;
        if (aohsVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar4 = (aoht) aihfVarCreateBuilder.instance;
            aohtVar4.h = aohsVar;
            aohtVar4.b |= 64;
        }
        if (d() > 0.0f) {
            float fD = d();
            aihfVarCreateBuilder.copyOnWrite();
            aoht aohtVar5 = (aoht) aihfVarCreateBuilder.instance;
            aohtVar5.b |= 16;
            aohtVar5.f = fD;
        }
        return (aoht) aihfVarCreateBuilder.build();
    }

    public final float d() {
        if ((this.f & 2) != 0) {
            return this.e;
        }
        throw new IllegalStateException("Property \"startTimeSeconds\" has not been set");
    }

    public final int e() {
        if ((this.f & 1) != 0) {
            return this.d;
        }
        throw new IllegalStateException("Property \"index\" has not been set");
    }

    public final void f(boolean z) {
        n();
        aihf builder = this.c.toBuilder();
        builder.copyOnWrite();
        aohs aohsVar = (aohs) builder.instance;
        aohsVar.b |= 32;
        aohsVar.g = z;
        this.c = (aohs) builder.build();
    }

    public final void g() {
        n();
        aihf builder = this.c.toBuilder();
        builder.copyOnWrite();
        aohs aohsVar = (aohs) builder.instance;
        aohsVar.b |= 8;
        aohsVar.e = true;
        this.c = (aohs) builder.build();
    }

    public final void h(int i) {
        this.d = i;
        this.f = (byte) (this.f | 1);
    }

    public final void i(anzw anzwVar) {
        n();
        aihf builder = this.c.toBuilder();
        builder.copyOnWrite();
        aohs aohsVar = (aohs) builder.instance;
        aohsVar.f = anzwVar.k;
        aohsVar.b |= 16;
        this.c = (aohs) builder.build();
    }

    public final void j(aofy aofyVar) {
        n();
        aihf builder = this.c.toBuilder();
        builder.copyOnWrite();
        aohs aohsVar = (aohs) builder.instance;
        aohsVar.h = aofyVar.g;
        aohsVar.b |= 64;
        this.c = (aohs) builder.build();
    }

    public final void k(boolean z) {
        n();
        aihf builder = this.c.toBuilder();
        builder.copyOnWrite();
        aohs aohsVar = (aohs) builder.instance;
        aohsVar.b |= 4;
        aohsVar.c = z;
        this.c = (aohs) builder.build();
    }

    public final void l(int i) {
        n();
        aihf builder = this.c.toBuilder();
        builder.copyOnWrite();
        ((aohs) builder.instance).d = aohs.emptyIntList();
        builder.copyOnWrite();
        aohs aohsVar = (aohs) builder.instance;
        aihv aihvVar = aohsVar.d;
        if (!aihvVar.c()) {
            aohsVar.d = aihn.mutableCopy(aihvVar);
        }
        aohsVar.d.h(i);
        this.c = (aohs) builder.build();
    }

    public final void m(float f) {
        this.e = f;
        this.f = (byte) (this.f | 2);
    }
}
