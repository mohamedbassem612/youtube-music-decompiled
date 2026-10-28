package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ije extends admr {
    private final admd a;
    private final jbm b;

    public ije(Context context, tbt tbtVar, jij jijVar) {
        context.getClass();
        jdw jdwVar = new jdw(context);
        this.a = jdwVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.playlist_create_entry, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.create_entry);
        this.b = jijVar.a(linearLayout.findViewById(R.id.create_button), linearLayout, new hdf(tbtVar, 8), null, true);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        return ((jdw) this.a).a;
    }

    @Override // defpackage.admr
    public final /* bridge */ /* synthetic */ void d(adly adlyVar, Object obj) {
        this.b.j(adlyVar, (ajnf) obj, 16);
        this.a.e(adlyVar);
    }

    @Override // defpackage.admr
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ajnf) obj).y.G();
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }
}
