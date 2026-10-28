package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wyv {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/livechat/ui/common/LiveChatAccountNameProvider");
    public String a = null;
    public Pattern b = null;

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a = null;
            this.b = null;
        } else {
            if (str.equals(this.a)) {
                return;
            }
            this.a = str;
            try {
                this.b = Pattern.compile("(@|#){1}" + str.replaceAll("([^a-zA-Z0-9 ])", "\\\\$1").replace(" ", "([\ufeff\\s])*"));
            } catch (PatternSyntaxException e) {
                ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/livechat/ui/common/LiveChatAccountNameProvider", "setAccountName", '(', "LiveChatAccountNameProvider.java")).t("LiveChatAccountNameProvider failed pattern");
            }
        }
    }
}
