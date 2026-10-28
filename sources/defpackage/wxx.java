package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wxx implements wxi, wxt, zza {
    private final String a;
    private amqw b;
    private final ttm c;
    private final String d;
    private final wwn e;
    private aeiv f;
    private final ahgb g;

    public wxx(wwn wwnVar, ahgb ahgbVar, ttm ttmVar, aeiv aeivVar, amqw amqwVar, String str) {
        this.a = "";
        this.e = wwnVar;
        this.g = ahgbVar;
        this.c = ttmVar;
        this.f = aeivVar;
        this.b = amqwVar;
        this.d = str;
    }

    @Override // defpackage.wxi
    public final wwv A() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.r;
        }
        return null;
    }

    @Override // defpackage.wxi
    public final wwn B() {
        wwn wwnVar = this.e;
        if (wwnVar == null) {
            return null;
        }
        return wwnVar;
    }

    @Override // defpackage.wxi
    public final wws C() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.j;
        }
        return null;
    }

    @Override // defpackage.wxi
    public final xdb D() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.t;
        }
        return null;
    }

    @Override // defpackage.tnh
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alxx alxxVar = (alxx) obj;
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            long j = alxxVar.d;
            if (j > 0) {
                Duration durationOf = Duration.of(j, ChronoUnit.MICROS);
                if (wwnVar.v.m(23, 45798386L)) {
                    wwnVar.g.r(durationOf);
                }
            }
            this.g.k(alxxVar.c, this, true);
            alxv alxvVar = alxxVar.e;
            if (alxvVar == null) {
                alxvVar = alxv.a;
            }
            int i = alxvVar.b;
        }
    }

    @Override // defpackage.wxi
    public final wwc b() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.b();
        }
        return null;
    }

    @Override // defpackage.wxi
    public final wxl c() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.g;
        }
        return null;
    }

    @Override // defpackage.wxi
    public final wxq e() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.d;
        }
        return null;
    }

    @Override // defpackage.wxt
    public final amqw f() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.wxi
    public final Object g(String str) {
        aeiv aeivVar;
        if (TextUtils.equals(str, "ClientMessageIdKey")) {
            return this.d;
        }
        if (!TextUtils.equals(str, "MessageKey")) {
            return null;
        }
        amqw amqwVar = this.b;
        if (amqwVar == null || (aeivVar = this.f) == null) {
            return this.a;
        }
        aihh aihhVar = (aihh) alay.a.createBuilder();
        int size = amqwVar.c.size();
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                aihh aihhVar2 = (aihh) alba.a.createBuilder();
                amqx amqxVar = (amqx) amqwVar.c.get(i);
                if ((amqxVar.b == 1 ? (String) amqxVar.c : "").isEmpty()) {
                    amqx amqxVar2 = (amqx) amqwVar.c.get(i);
                    if (!(amqxVar2.b == 2 ? (String) amqxVar2.c : "").isEmpty()) {
                        aihl aihlVar = aktj.b;
                        amqx amqxVar3 = (amqx) amqwVar.c.get(i);
                        aihhVar2.e(aihlVar, (aktj) aeivVar.a.get(amqxVar3.b == 2 ? (String) amqxVar3.c : ""));
                    }
                } else {
                    amqx amqxVar4 = (amqx) amqwVar.c.get(i);
                    String str2 = amqxVar4.b == 1 ? (String) amqxVar4.c : "";
                    aihhVar2.copyOnWrite();
                    alba albaVar = (alba) aihhVar2.instance;
                    str2.getClass();
                    albaVar.b |= 1;
                    albaVar.c = str2;
                }
                aihhVar.v(aihhVar2);
            }
        }
        boolean z = amqwVar.d;
        aihhVar.copyOnWrite();
        alay alayVar = (alay) aihhVar.instance;
        alayVar.b |= 2;
        alayVar.e = z;
        return (alay) aihhVar.build();
    }

    @Override // defpackage.wxt
    public final String h() {
        return this.a;
    }

    @Override // defpackage.wxi
    public final wxp jg() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.e;
        }
        return null;
    }

    @Override // defpackage.wxt
    public final String ji() {
        return this.d;
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        this.c.e(toeVar);
    }

    @Override // defpackage.wxi
    public final wwk z() {
        wwn wwnVar = this.e;
        if (wwnVar != null) {
            return wwnVar.s;
        }
        return null;
    }

    public wxx(wwn wwnVar, ahgb ahgbVar, ttm ttmVar, String str, String str2) {
        this.e = wwnVar;
        this.g = ahgbVar;
        this.c = ttmVar;
        this.a = str;
        this.d = str2;
    }

    @Override // defpackage.wxt
    public final wxi d() {
        return this;
    }

    @Override // defpackage.wxt
    public final zza jh() {
        return this;
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
