package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hmw implements aaiz {
    private static final boolean b(hmw hmwVar, hmw hmwVar2, Class cls) {
        hmwVar2.a();
        return hmwVar.a().getClass() == cls && hmwVar2.a().getClass() == cls;
    }

    public abstract Object a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hmw) {
            hmw hmwVar = (hmw) obj;
            if (b(this, hmwVar, anyx.class)) {
                return Objects.equals(((anyx) a()).getVideoId(), ((anyx) hmwVar.a()).getVideoId());
            }
            if (b(this, hmwVar, anuk.class)) {
                return Objects.equals(((anuk) a()).getPlaylistId(), ((anuk) hmwVar.a()).getPlaylistId());
            }
            if (b(this, hmwVar, anjx.class)) {
                return Objects.equals(((anjx) a()).getAudioPlaylistId(), ((anjx) hmwVar.a()).getAudioPlaylistId());
            }
        }
        return false;
    }

    public final int hashCode() {
        if (a() instanceof anyx) {
            return Objects.hashCode(((anyx) a()).getVideoId());
        }
        if (a() instanceof anuk) {
            return Objects.hashCode(((anuk) a()).getPlaylistId());
        }
        if (a() instanceof anjx) {
            return Objects.hashCode(((anjx) a()).getAudioPlaylistId());
        }
        return 0;
    }
}
