package defpackage;

import android.media.MediaMetadataRetriever;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iow implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ iow(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVarCreateBuilder = aild.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aild aildVar = (aild) aihfVarCreateBuilder.instance;
            aildVar.b |= 1;
            aildVar.c = this.a + 1;
            return (aild) aihfVarCreateBuilder.build();
        }
        if (i == 1) {
            return ((MediaMetadataRetriever) obj).extractMetadata(this.a);
        }
        if (i != 2) {
            if (i == 3) {
                return new aami(obj, this.a);
            }
            wjf wjfVar = (wjf) obj;
            wjfVar.k().c("PLAYER_RESPONSE_SOURCE_KEY", this.a);
            return wjfVar;
        }
        aihf builder = ((atox) obj).toBuilder();
        builder.copyOnWrite();
        atox atoxVar = (atox) builder.instance;
        atoxVar.b |= 16;
        atoxVar.g = this.a;
        return (atox) builder.build();
    }
}
