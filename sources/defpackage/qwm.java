package defpackage;

import j$.time.Duration;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class qwm extends qvs {
    public qxe k;
    public Duration l;
    public boolean r;
    public float s;
    public boolean t;

    protected qwm(qwm qwmVar) {
        super(qwmVar);
        this.l = Duration.ZERO;
        this.r = true;
        this.s = 1.0f;
        this.t = false;
        this.k = qwmVar.k;
        this.l = qwmVar.l;
        this.s = qwmVar.s;
        this.r = qwmVar.r;
        this.t = qwmVar.t;
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qwm clone() {
        return new qwm(this);
    }

    @Override // defpackage.qvs, defpackage.qvu
    public final String toString() {
        return String.format(Locale.US, "VideoSegment{%s, sourceUri: %s, sourceStartTime: %s, playbackRate: %f, enableLooping: %b, applyEffectsAfterCrop: %b}", super.toString(), this.k.c(), this.l, Float.valueOf(this.s), Boolean.valueOf(this.r), Boolean.valueOf(this.t));
    }

    public final void v(Duration duration) {
        this.l = nrb.e(duration);
    }

    public qwm(qxe qxeVar) {
        this.l = Duration.ZERO;
        this.r = true;
        this.s = 1.0f;
        this.t = false;
        this.k = qxeVar;
    }

    protected qwm(qxe qxeVar, UUID uuid) {
        super(uuid);
        this.l = Duration.ZERO;
        this.r = true;
        this.s = 1.0f;
        this.t = false;
        this.k = qxeVar;
    }
}
