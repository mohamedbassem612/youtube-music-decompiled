package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyc {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public adyc(final Context context, vxe vxeVar, aciz acizVar, ahhp ahhpVar, aedj aedjVar, final abfv abfvVar, final boolean z) {
        this.f = vxeVar;
        this.c = acizVar;
        this.b = ahhpVar;
        adog adogVar = new adog(context);
        this.e = adogVar;
        adogVar.e.setOnCheckedChangeListener(new dlm(this, 7, null));
        fu fuVar = new fu(context);
        fuVar.a(true);
        fuVar.setView(adogVar);
        fuVar.setNegativeButton(R.string.cancel, new xyo(4));
        fuVar.setPositiveButton(R.string.ok, new xqu(this, 9));
        fv fvVarCreate = fuVar.create();
        this.d = fvVarCreate;
        fvVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: adoa
            /* JADX WARN: Type inference failed for: r9v2, types: [aeda, java.lang.Object] */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Window window;
                fv fvVar = (fv) this.c.d;
                Button buttonB = fvVar.b(-2);
                Button buttonB2 = fvVar.b(-1);
                if (!z) {
                    Context context2 = context;
                    buttonB.setTextColor(tzk.i(context2, R.attr.ytCallToAction));
                    buttonB2.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{tzk.i(context2, R.attr.ytTextDisabled), tzk.i(context2, R.attr.ytCallToAction)}));
                }
                abfv abfvVar2 = abfvVar;
                if (abfvVar2.j()) {
                    buttonB.setAllCaps(false);
                    buttonB2.setAllCaps(false);
                }
                if (!abfvVar2.a.o() || (window = fvVar.getWindow()) == null) {
                    return;
                }
                Drawable drawable = fvVar.getContext().getDrawable(R.drawable.bg_dialog_rounded);
                drawable.getClass();
                window.setBackgroundDrawable(drawable);
            }
        });
        fvVarCreate.setOnCancelListener(new adob());
        fvVarCreate.setOnDismissListener(new sqx(this, 4));
        adol adolVar = new adol(context, aedjVar);
        this.a = adolVar;
        adolVar.registerDataSetObserver(new adoc(this));
    }

    public final void a() {
        adog adogVar = (adog) this.e;
        adogVar.d.setVisibility(8);
        CompoundButton compoundButton = adogVar.e;
        compoundButton.setChecked(false);
        compoundButton.setVisibility(8);
        adogVar.f.setVisibility(8);
    }

    public final void b() {
        e();
        d(false);
        a();
    }

    public final void c(ajnf ajnfVar) {
        alay alayVar;
        if (ajnfVar != null) {
            Button buttonB = ((fv) this.d).b(-1);
            if ((ajnfVar.b & 64) != 0) {
                alayVar = ajnfVar.m;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            buttonB.setText(ackj.k(null, alayVar, null, false));
        }
    }

    public final void d(boolean z) {
        ((fv) this.d).b(-1).setEnabled(z);
    }

    public final void e() {
        ajnf ajnfVar;
        aciz acizVar = (aciz) this.c;
        apkc apkcVar = (apkc) acizVar.a;
        ajng ajngVar = apkcVar.f;
        if (ajngVar == null) {
            ajngVar = ajng.a;
        }
        ajnf ajnfVar2 = null;
        if ((ajngVar.b & 1) != 0) {
            ajng ajngVar2 = apkcVar.f;
            if (ajngVar2 == null) {
                ajngVar2 = ajng.a;
            }
            ajnfVar = ajngVar2.c;
            if (ajnfVar == null) {
                ajnfVar = ajnf.a;
            }
        } else {
            ajnfVar = null;
        }
        ajng ajngVar3 = ((aokf) acizVar.b).e;
        if (((ajngVar3 == null ? ajng.a : ajngVar3).b & 1) != 0) {
            if (ajngVar3 == null) {
                ajngVar3 = ajng.a;
            }
            ajnfVar2 = ajngVar3.c;
            if (ajnfVar2 == null) {
                ajnfVar2 = ajnf.a;
            }
        }
        c((ajnf) ahno.ad(ajnfVar, ajnfVar2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    public final synchronized void f(Consumer consumer) {
        Object obj = this.b;
        ((AtomicBoolean) obj).set(true);
        ?? r1 = this.a;
        for (snu snuVar : r1) {
            if (snuVar != null) {
                consumer.r(snuVar);
            }
        }
        ((AtomicBoolean) obj).set(false);
        ?? r5 = this.d;
        r1.addAll(r5);
        ?? r0 = this.e;
        r1.removeAll(r0);
        r5.clear();
        r0.clear();
    }

    public adyc() {
        this.b = new AtomicBoolean(false);
        this.a = new HashSet();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashMap();
        new HashMap();
        this.c = new HashSet();
    }

    public adyc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        this.f = awmdVar4;
        awmdVar5.getClass();
        this.c = awmdVar5;
        this.a = awmdVar6;
    }

    public adyc(abvn abvnVar, aeiy aeiyVar, hno hnoVar, Executor executor, zkh zkhVar) {
        this.e = abvnVar;
        this.b = abvnVar.j();
        this.a = aeiyVar;
        this.c = hnoVar;
        this.f = executor;
        this.d = zkhVar;
    }

    public adyc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6) {
        awmdVar.getClass();
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = awmdVar3;
        this.c = awmdVar4;
        this.a = awmdVar5;
        this.b = awmdVar6;
    }

    public adyc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, byte[] bArr, byte[] bArr2) {
        this.b = awmdVar;
        this.a = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
    }

    public adyc(View view) {
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (TextView) view.findViewById(R.id.list_item_secondary_text);
        this.d = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.e = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
        this.c = (TextView) view.findViewById(R.id.list_item_text_secondary_separator);
        this.f = view.findViewById(R.id.list_item_bottom_divider);
    }
}
