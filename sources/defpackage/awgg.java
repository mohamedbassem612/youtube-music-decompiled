package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class awgg {
    public final Object a;
    public final Object b;
    public final /* synthetic */ Object c;

    public awgg(final aekq aekqVar, View view) {
        this.c = aekqVar;
        int i = aene.a;
        ((ImageView) view.findViewById(R.id.sharer_thumbnail)).getClass();
        EditText editText = (EditText) view.findViewById(R.id.message_input);
        this.b = editText;
        ImageView imageView = (ImageView) view.findViewById(R.id.inline_send_button);
        this.a = imageView;
        view.findViewById(R.id.message_input_shadow);
        editText.addTextChangedListener(new gxv(this, 13));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: aekp
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                for (aekx aekxVar : aekqVar.a) {
                }
                Object obj = this.b.b;
                if (!((EditText) obj).isInputMethodTarget() || z) {
                    return;
                }
                tuk.i((View) obj);
            }
        });
        imageView.setOnClickListener(new aefn(aekqVar, 7));
    }

    public final void a(int i, avma avmaVar) {
        axsp[] axspVarArr = (axsp[]) this.b;
        ((awgj) this.c).b(i, (axsp[]) this.a, axspVarArr, avmaVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahhm, java.lang.Object] */
    public final Object b(ahfv ahfvVar) {
        return this.c.a(ahfvVar);
    }

    public awgg(Class cls, Class cls2, ahhm ahhmVar) {
        this.c = ahhmVar;
        this.b = cls;
        this.a = cls2;
    }

    public awgg(awgj awgjVar, axsp[] axspVarArr, axsp[] axspVarArr2) {
        this.c = awgjVar;
        this.a = axspVarArr;
        this.b = axspVarArr2;
    }
}
