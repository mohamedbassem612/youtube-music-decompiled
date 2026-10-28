package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bct extends View {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ bcv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bct(bcv bcvVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = bcvVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        bcv bcvVar = this.b;
        if (bcvVar.e == color) {
            return;
        }
        bcvVar.e = color;
        ArrayList arrayList = bcvVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((acik) arrayList.get(size)).c();
            }
        }
    }
}
