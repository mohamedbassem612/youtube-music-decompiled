package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class fi {
    public long a;
    public long b;
    public Bundle c;
    private final List d;
    private int e;
    private long f;
    private long g;
    private float h;
    private int i;
    private CharSequence j;
    private long k;

    public fi(PlaybackStateCompat playbackStateCompat) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = -1L;
        this.e = playbackStateCompat.a;
        this.f = playbackStateCompat.b;
        this.h = playbackStateCompat.d;
        this.k = playbackStateCompat.h;
        this.g = playbackStateCompat.c;
        this.a = playbackStateCompat.e;
        this.i = playbackStateCompat.f;
        this.j = playbackStateCompat.g;
        List list = playbackStateCompat.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.b = playbackStateCompat.j;
        this.c = playbackStateCompat.k;
    }

    public final PlaybackStateCompat a() {
        return new PlaybackStateCompat(this.e, this.f, this.g, this.h, this.a, this.i, this.j, this.k, this.d, this.b, this.c);
    }

    public final void b(PlaybackStateCompat.CustomAction customAction) {
        this.d.add(customAction);
    }

    public final void c(int i, CharSequence charSequence) {
        this.i = i;
        this.j = charSequence;
    }

    public final void d(int i, long j, float f, long j2) {
        this.e = i;
        this.f = j;
        this.k = j2;
        this.h = f;
    }

    public final void e(int i, long j, float f) {
        d(i, j, f, SystemClock.elapsedRealtime());
    }

    public fi() {
        this.d = new ArrayList();
        this.b = -1L;
    }
}
