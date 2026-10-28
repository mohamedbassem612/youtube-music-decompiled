package defpackage;

import android.content.Context;
import android.text.Spanned;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ikq implements ikr {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/playlist/voting/PlaylistVotingDropdownItem");
    private final CharSequence b;
    private final CharSequence c;
    private final boolean d;
    private final int e;

    private ikq(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        this.b = charSequence;
        this.c = charSequence2;
        this.e = i;
        this.d = z;
    }

    public static ikq d(akoa akoaVar) {
        akoaVar.getClass();
        alay alayVar = akoaVar.e;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        alay alayVar2 = akoaVar.f;
        if (alayVar2 == null) {
            alayVar2 = alay.a;
        }
        return new ikq(spannedK, ackj.k(null, alayVar2, null, false), f(akoaVar), akoaVar.i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[Catch: IllegalArgumentException -> 0x0067, TRY_ENTER, TryCatch #0 {IllegalArgumentException -> 0x0067, blocks: (B:15:0x0024, B:16:0x0029, B:31:0x0061, B:32:0x0066), top: B:39:0x0024 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int f(akoa akoaVar) {
        int iAV;
        String upperCase;
        int i = akoaVar.c;
        int i2 = 0;
        if (i == 6) {
            iAV = a.aV(i == 6 ? ((Integer) akoaVar.d).intValue() : 0);
        } else {
            iAV = 0;
        }
        if (iAV == 0) {
            int i3 = akoaVar.c;
            if (i3 == 7) {
                String str = "";
                if (i3 != 7) {
                    upperCase = str.toUpperCase(Locale.getDefault());
                    switch (upperCase.hashCode()) {
                        case -1385728906:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_COLLABORATOR")) {
                                i2 = 3;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case -911592281:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_UNSPECIFIED")) {
                                i2 = 1;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 37476063:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_OFF")) {
                                i2 = 4;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 382920155:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_EVERYONE")) {
                                i2 = 2;
                                break;
                            }
                            throw new IllegalArgumentException();
                        default:
                            throw new IllegalArgumentException();
                    }
                }
                try {
                    str = (String) akoaVar.d;
                    upperCase = str.toUpperCase(Locale.getDefault());
                    switch (upperCase.hashCode()) {
                        case -1385728906:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_COLLABORATOR")) {
                                i2 = 3;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case -911592281:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_UNSPECIFIED")) {
                                i2 = 1;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 37476063:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_OFF")) {
                                i2 = 4;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 382920155:
                            if (upperCase.equals("ENGAGEMENT_PERMISSION_EVERYONE")) {
                                i2 = 2;
                                break;
                            }
                            throw new IllegalArgumentException();
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "PlaylistVotingDropdown")).j(e)).k("com/google/android/apps/youtube/music/playlist/voting/PlaylistVotingDropdownItem", "parseEngagementPermission", '=', "PlaylistVotingDropdownItem.java")).t("Wrong Playlist EngagementPermission string value from server");
                }
            }
        } else {
            i2 = iAV;
        }
        if (i2 != 0) {
            return i2;
        }
        return 4;
    }

    @Override // defpackage.ikr
    public final CharSequence a(Context context) {
        return this.c;
    }

    @Override // defpackage.ikr
    public final CharSequence b(Context context) {
        return this.b;
    }

    @Override // defpackage.ikr
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.ikr
    public final int e() {
        return this.e;
    }
}
