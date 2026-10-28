package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class iju {
    private static final agrf d = agrf.h("com/google/android/apps/youtube/music/playlist/comment/PlaylistCommentDropdownItem");
    public final CharSequence a;
    public final CharSequence b;
    public final int c;

    public iju(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
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
    public static int a(akoa akoaVar) {
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
                        case -2024371205:
                            if (upperCase.equals("COMMENT_PERMISSION_DISABLE_COMMENTS")) {
                                i2 = 2;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 792787117:
                            if (upperCase.equals("COMMENT_PERMISSION_PAUSE_COMMENTS")) {
                                i2 = 4;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 899530944:
                            if (upperCase.equals("COMMENT_PERMISSION_ENABLE_COMMENTS")) {
                                i2 = 3;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 1705131687:
                            if (upperCase.equals("COMMENT_PERMISSION_UNSPECIFIED")) {
                                i2 = 1;
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
                        case -2024371205:
                            if (upperCase.equals("COMMENT_PERMISSION_DISABLE_COMMENTS")) {
                                i2 = 2;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 792787117:
                            if (upperCase.equals("COMMENT_PERMISSION_PAUSE_COMMENTS")) {
                                i2 = 4;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 899530944:
                            if (upperCase.equals("COMMENT_PERMISSION_ENABLE_COMMENTS")) {
                                i2 = 3;
                                break;
                            }
                            throw new IllegalArgumentException();
                        case 1705131687:
                            if (upperCase.equals("COMMENT_PERMISSION_UNSPECIFIED")) {
                                i2 = 1;
                                break;
                            }
                            throw new IllegalArgumentException();
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    ((agrc) ((agrc) ((agrc) d.b().i(agso.a, "PlaylistCommentDropdown")).j(e)).k("com/google/android/apps/youtube/music/playlist/comment/PlaylistCommentDropdownItem", "parseCommentPermission", '7', "PlaylistCommentDropdownItem.java")).t("Wrong Playlist CommentPermission string value from server");
                }
            }
        } else {
            i2 = iAV;
        }
        if (i2 != 0) {
            return i2;
        }
        return 3;
    }
}
