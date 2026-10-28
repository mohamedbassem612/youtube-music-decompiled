package defpackage;

import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSeekBarPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acly implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ acly(int i, String str, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.twi
    public final void a(Object obj) {
        if (this.$cid == 0) {
            ((acln) obj).c(this.a, (String) this.b);
        } else {
            ((ProtoDataStoreSeekBarPreference) this.b).p(this.a);
        }
    }

    public /* synthetic */ acly(ProtoDataStoreSeekBarPreference protoDataStoreSeekBarPreference, int i, int i2) {
        this.$cid = i2;
        this.b = protoDataStoreSeekBarPreference;
        this.a = i;
    }
}
