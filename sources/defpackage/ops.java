package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ops {
    private static final Resources a = Resources.getSystem();
    private static final agkj b = agkj.o("selected", Integer.valueOf(R.string.elements_selected), "not_selected", Integer.valueOf(R.string.elements_not_selected), "checked", Integer.valueOf(R.string.elements_checked), "not_checked", Integer.valueOf(R.string.elements_not_checked), "capital_on", Integer.valueOf(R.string.elements_toggle_on), "capital_off", Integer.valueOf(R.string.elements_toggle_off));
    private final Map c = new HashMap();
    private final Context d;

    public ops(Context context) {
        this.d = context;
    }

    private final String b(String str) {
        try {
            Resources resources = a;
            return resources.getString(resources.getIdentifier(str, "string", "android"));
        } catch (Resources.NotFoundException unused) {
            Integer num = (Integer) b.get(str);
            if (num == null) {
                return "";
            }
            try {
                return this.d.getString(num.intValue());
            } catch (Resources.NotFoundException unused2) {
                return str;
            }
        }
    }

    public final String a(String str) {
        Map map = this.c;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        String strB = b(str);
        map.put(str, strB);
        return strB;
    }
}
