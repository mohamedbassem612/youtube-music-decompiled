package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adco extends FrameLayout implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    public static final /* synthetic */ int h = 0;
    public final SeekBar a;
    public aunn b;
    public CommandOuterClass$Command c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public nuc f;
    public boolean g;

    public adco(Context context) {
        super(context);
        this.g = false;
        LayoutInflater.from(context).inflate(R.layout.default_seek_bar, this);
        SeekBar seekBar = (SeekBar) findViewById(R.id.slider_seek_bar);
        this.a = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setOnTouchListener(new vsl(4));
    }

    private static assu b(int i) {
        aihf aihfVarCreateBuilder = assu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        assu assuVar = (assu) aihfVarCreateBuilder.instance;
        assuVar.c = 1;
        assuVar.d = Integer.valueOf(i);
        return (assu) aihfVarCreateBuilder.build();
    }

    public final void a(int i, CommandOuterClass$Command commandOuterClass$Command) {
        if (commandOuterClass$Command != null) {
            aunn aunnVar = this.b;
            if (aunnVar == null || aunnVar.io() == null) {
                this.f.c(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, nsl.a, "OnTouchCommand provided but no usable command resolver found.", new Object[0]);
                return;
            }
            nrt nrtVarD = nrv.d();
            nrtVarD.d(this);
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(assu.b, b(i));
            nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
            boolean z = this.g;
            aunn aunnVar2 = this.b;
            if (z) {
                ((nry) aunnVar2.io()).a(commandOuterClass$Command, nrtVarD.a()).D();
            } else {
                ((nry) aunnVar2.io()).a(commandOuterClass$Command, nrtVarD.a()).G();
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z || this.c == null) {
            return;
        }
        SeekBar seekBar2 = this.a;
        if (seekBar2.isHapticFeedbackEnabled()) {
            if (i != 0 && i != seekBar2.getMax()) {
                seekBar2.performHapticFeedback(4);
            } else if (Build.VERSION.SDK_INT >= 30) {
                seekBar2.performHapticFeedback(17);
            }
        }
        aunn aunnVar = this.b;
        if (aunnVar == null || aunnVar.io() == null) {
            this.f.c(aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR, nsl.a, "OnChangeCommand provided but no usable command resolver found.", new Object[0]);
            return;
        }
        nrt nrtVarD = nrv.d();
        nrtVarD.d(this);
        aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
        aihhVar.e(assu.b, b(i));
        nrtVarD.e = (SenderStateOuterClass$SenderState) aihhVar.build();
        boolean z2 = this.g;
        aunn aunnVar2 = this.b;
        if (z2) {
            ((nry) aunnVar2.io()).a(this.c, nrtVarD.a()).D();
        } else {
            ((nry) aunnVar2.io()).a(this.c, nrtVarD.a()).G();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.d != null) {
            a(seekBar.getProgress(), this.d);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.e != null) {
            a(seekBar.getProgress(), this.e);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
