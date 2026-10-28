package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afpe extends ContextWrapper implements afov {
    private final agfr a;

    /* JADX WARN: Illegal instructions before constructor call */
    public afpe(cc ccVar, LayoutInflater layoutInflater) {
        Context context = layoutInflater.getContext();
        context.getClass();
        b(context, a(ccVar));
        super(context);
        this.a = aguu.al(new ahvl(this, layoutInflater, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Locale a(cc ccVar) {
        Locale customLocale;
        if ((ccVar instanceof afpd) && (customLocale = ((afpd) ccVar).getCustomLocale()) != null) {
            return customLocale;
        }
        cc parentFragment = ccVar.getParentFragment();
        if (parentFragment != null) {
            return a(parentFragment);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !"layout_inflater".equals(str) ? getBaseContext().getSystemService(str) : this.a.io();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpe(cc ccVar, Context context) {
        super(context);
        context.getClass();
        b(context, a(ccVar));
        this.a = aguu.al(new aeru(this, 5));
    }
}
