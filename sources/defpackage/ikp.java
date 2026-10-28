package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum ikp implements ikr {
    EVERYONE(R.string.playlist_voting_everyone, R.string.playlist_voting_everyone_detail, 2),
    COLLABORATORS_ONLY(R.string.playlist_voting_collaborators_only, R.string.playlist_voting_collaborators_only_detail, 3),
    OFF(R.string.playlist_voting_off, R.string.playlist_voting_off_detail, 4);

    private final int e;
    private final int f;
    private final int g;

    ikp(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public static ikp d(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? OFF : COLLABORATORS_ONLY;
        }
        return EVERYONE;
    }

    @Override // defpackage.ikr
    public final CharSequence a(Context context) {
        return context.getResources().getString(this.f);
    }

    @Override // defpackage.ikr
    public final CharSequence b(Context context) {
        return context.getResources().getString(this.e);
    }

    @Override // defpackage.ikr
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ikr
    public final int e() {
        return this.g;
    }
}
