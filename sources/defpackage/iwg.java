package defpackage;

import com.google.android.apps.youtube.music.ui.avatarmenu.AvatarActionProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwg extends jlc {
    final /* synthetic */ AvatarActionProvider a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwg(AvatarActionProvider avatarActionProvider, avmb avmbVar) {
        super(500L, avmbVar);
        this.a = avatarActionProvider;
    }

    @Override // defpackage.jlc
    public final void a() {
        AvatarActionProvider avatarActionProvider = this.a;
        avatarActionProvider.f.ah();
        new iwj().h(avatarActionProvider.f, null);
    }
}
