package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adyj extends qny {
    public boolean a;
    public String b;
    public Runnable c;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    private final ArrayList q;
    private boolean r;

    public adyj(String str) {
        super(str);
        this.a = true;
        this.i = true;
        this.j = true;
        this.l = false;
        this.n = 1;
        this.o = 1;
        this.p = 1;
        this.q = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((adyi) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.qny, defpackage.qnx
    public final int b() {
        if (this.m) {
            return R.layout.modern_bottom_sheet_enableable_list_item;
        }
        return this.l ? R.layout.bottom_sheet_enableable_multi_line_list_item : R.layout.bottom_sheet_enableable_list_item;
    }

    @Override // defpackage.qny, defpackage.qnx
    public boolean c() {
        return this.a;
    }

    public final void e(String str) {
        if (str != null) {
            ahno.P(this.g == null, "Cannot set detail text when a secondary icon is present.");
        }
        if (Objects.equals(this.h, str)) {
            return;
        }
        this.h = str;
        a();
    }

    public final void f(String str) {
        if (Objects.equals(this.b, str)) {
            return;
        }
        this.b = str;
        a();
    }

    public final void g(boolean z) {
        if (this.r != z) {
            this.r = z;
            a();
        }
    }

    public adyj(Context context, String str) {
        this(str);
        d(context.getColor(R.color.ytm_text_color_primary));
    }
}
