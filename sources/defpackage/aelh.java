package defpackage;

import android.app.Activity;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aelh implements zza {
    public final /* synthetic */ aeli a;
    private final Activity b;
    private final Optional c;
    private final apth d;
    private final xgm e;

    public aelh(aeli aeliVar, Activity activity, apth apthVar, Optional optional, xgm xgmVar) {
        this.a = aeliVar;
        this.b = activity;
        this.d = apthVar;
        this.c = optional;
        this.e = xgmVar;
    }

    public final void d(Throwable th) {
        ((agrc) ((agrc) ((agrc) aeli.a.b()).j(th)).k("com/google/android/libraries/youtube/share/endpoint/InvitePlaylistCollaboratorsCommandResolver$FetchCollaborationInviteLinkListener", "onError", (char) 158, "InvitePlaylistCollaboratorsCommandResolver.java")).t("Error requesting collaboration invite link.");
        this.a.b.e(th);
        adyu adyuVar = new adyu(this, 7);
        Optional optional = this.c;
        if (true == optional.isPresent()) {
            ((vxe) ((aelh) adyuVar.a).a.c.io()).a((ajwo) optional.get());
        }
    }

    @Override // defpackage.tnh
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(alvy alvyVar) {
        if (alvyVar.h.isEmpty()) {
            tuk.o(this.b, "Collaboration invite link is not available", 0);
            return;
        }
        if ((alvyVar.b & SemanticState.Multiline) != 0) {
            this.e.hB().d(new xgj(alvyVar.l, (amud) null));
        }
        Activity activity = this.b;
        apth apthVar = this.d;
        tym.e(activity, apthVar.e, apthVar.f, Uri.parse(alvyVar.h));
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        d(toeVar);
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
