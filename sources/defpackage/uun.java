package defpackage;

import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uun extends utz {
    private final Uri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uun(long j, Uri uri) {
        super(j);
        uri.getClass();
        this.a = uri;
    }

    @Override // defpackage.utz
    public final augy e(augy augyVar) {
        if (augyVar.c != 109) {
            Log.e("UpdateImageGraphicalSegmentMutation", "Unable to find image segment to update");
            return augyVar;
        }
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.getClass();
        augz augzVar = augyVar.c == 109 ? (augz) augyVar.d : augz.a;
        augzVar.getClass();
        aihf builder = augzVar.toBuilder();
        builder.getClass();
        aihf aihfVarCreateBuilder = auhk.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        String string = this.a.toString();
        string.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        auhk auhkVar = (auhk) aihfVarCreateBuilder.instance;
        auhkVar.b |= 1;
        auhkVar.c = string;
        aihfVarCreateBuilder.copyOnWrite();
        auhk auhkVar2 = (auhk) aihfVarCreateBuilder.instance;
        auhkVar2.b |= 2;
        auhkVar2.d = false;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        builder.copyOnWrite();
        augz augzVar2 = (augz) builder.instance;
        augzVar2.c = (auhk) aihnVarBuild;
        augzVar2.b = 1;
        aihn aihnVarBuild2 = builder.build();
        aihnVarBuild2.getClass();
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        augyVar2.d = (augz) aihnVarBuild2;
        augyVar2.c = 109;
        return atxy.h(jrrVar);
    }
}
