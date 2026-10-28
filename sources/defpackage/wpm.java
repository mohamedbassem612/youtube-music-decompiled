package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpm extends wlu {
    private final String a;
    private final String b;
    private final String c;

    public wpm(abxv abxvVar, zwa zwaVar) {
        super("comment/get_comments", abxvVar, zwaVar, 1, false, null, null);
        this.a = "";
        this.b = "";
        this.c = "";
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alnn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alnn alnnVar = (alnn) aihfVarCreateBuilder.instance;
        alnnVar.b |= 4;
        alnnVar.e = this.a;
        String str = this.i;
        aihfVarCreateBuilder.copyOnWrite();
        alnn alnnVar2 = (alnn) aihfVarCreateBuilder.instance;
        str.getClass();
        alnnVar2.b |= 2;
        alnnVar2.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        alnn alnnVar3 = (alnn) aihfVarCreateBuilder.instance;
        alnnVar3.b |= 8;
        alnnVar3.f = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        alnn alnnVar4 = (alnn) aihfVarCreateBuilder.instance;
        alnnVar4.b |= SemanticState.Obscured;
        alnnVar4.g = this.b;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        String str = this.a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.c)) {
            throw new IllegalArgumentException("CommentServiceRequest: Can only set one of channelId and videoId.");
        }
        if (TextUtils.isEmpty(this.i)) {
            return;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.c)) {
            throw new IllegalArgumentException("CommentServiceRequest: continuation cannot be set if videoId or channelId set.");
        }
    }
}
