package defpackage;

import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreCheckBoxPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tvi implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tvi(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((ProtoDataStoreCheckBoxPreference) this.b).ai(this.a);
        } else if (i != 1) {
            ((ProtoDataStoreSwitchPreference) this.b).ae(this.a);
        } else {
            boolean z = this.a;
            Object obj2 = this.b;
            ((ira) obj2).e.d.kk(Boolean.valueOf(z));
        }
    }
}
