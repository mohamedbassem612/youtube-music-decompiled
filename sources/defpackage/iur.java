package defpackage;

import android.content.ContentValues;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iur implements qsx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iur(long j, agke agkeVar, int i) {
        this.$cid = i;
        this.a = j;
        this.b = agkeVar;
    }

    @Override // defpackage.qsx
    public final Object a(omr omrVar) {
        if (this.$cid != 0) {
            return Boolean.valueOf(omrVar.c("music_sideloaded_playlist", (ContentValues) this.b, "id = ?", String.valueOf(this.a)) != 0);
        }
        return Integer.valueOf(hfn.ax(omrVar, this.a, (agke) this.b));
    }

    public /* synthetic */ iur(ContentValues contentValues, long j, int i) {
        this.$cid = i;
        this.b = contentValues;
        this.a = j;
    }
}
