package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum abmw {
    MEDIASESSION("YTPL.mediasession"),
    AUDIOMANAGER("YTPL.audiomanager"),
    SSDAI("YTPL.dai"),
    NET("YTPL.net"),
    DIRECTOR("YTPL.director"),
    BACKGROUND("YTPL.background"),
    PLAYBACKSERVICE("YTPL.playbackservice");

    public final String h;

    abmw(String str) {
        this.h = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.h;
    }
}
