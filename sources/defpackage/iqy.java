package defpackage;

import androidx.preference.TwoStatePreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iqy implements jkv {
    final /* synthetic */ Object a;
    final /* synthetic */ TwoStatePreference b;
    final /* synthetic */ ira c;

    public iqy(ira iraVar, Object obj, TwoStatePreference twoStatePreference) {
        this.a = obj;
        this.b = twoStatePreference;
        this.c = iraVar;
    }

    @Override // defpackage.jkv
    public final void a(String str, int i) {
        this.b.k(false);
    }

    @Override // defpackage.jkv
    public final void b(String str, int i) {
        this.c.f.h(((Boolean) this.a).booleanValue());
    }
}
