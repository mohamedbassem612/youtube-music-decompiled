package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbw {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (a) {
                if (theme != null) {
                    rt rtVar = new rt(context2, theme);
                    rtVar.a(theme.getResources().getConfiguration());
                    context3 = rtVar;
                } else {
                    context3 = context2;
                }
                return dl.d(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        int i2 = avt.a;
        return resources.getDrawable(i, theme);
    }
}
