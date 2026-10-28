package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class grw implements View.OnKeyListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public grw(SeekBarPreference seekBarPreference, int i) {
        this.$cid = i;
        this.a = seekBarPreference;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        oxe oxeVar;
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 == 1) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = (SeekBarPreference) this.a;
                if ((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.d;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
            int action = keyEvent.getAction();
            int keyCode = keyEvent.getKeyCode();
            boolean zIsShiftPressed = keyEvent.isShiftPressed();
            boolean zIsCtrlPressed = keyEvent.isCtrlPressed();
            Object obj = this.a;
            if (action != 0) {
                if (keyCode != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                oxe oxeVar2 = (oxe) obj;
                if (!oxeVar2.k()) {
                    return false;
                }
                oxeVar2.b();
            } else if (zIsCtrlPressed) {
                if (keyCode == 31) {
                    ((oxe) obj).n();
                } else if (keyCode == 29) {
                    ((oxe) obj).o();
                } else if (zIsShiftPressed) {
                    if (keyCode == 21) {
                        ((oxe) obj).z(-1, zIsCtrlPressed);
                    } else if (keyCode == 22) {
                        ((oxe) obj).z(1, zIsCtrlPressed);
                    } else {
                        if (keyCode == 111) {
                            if (keyCode == 4) {
                                return false;
                            }
                            return false;
                        }
                        oxeVar = (oxe) obj;
                        if (!oxeVar.k()) {
                            if (keyCode == 4) {
                                return false;
                            }
                            return false;
                        }
                        oxeVar.b();
                    }
                } else {
                    if (keyCode == 111) {
                        if (keyCode == 4) {
                            return false;
                        }
                        return false;
                    }
                    oxeVar = (oxe) obj;
                    if (!oxeVar.k()) {
                        if (keyCode == 4) {
                            return false;
                        }
                        return false;
                    }
                    oxeVar.b();
                }
            } else if (zIsShiftPressed) {
                if (keyCode == 111) {
                    if (keyCode == 4) {
                        return false;
                    }
                    return false;
                }
                oxeVar = (oxe) obj;
                if (!oxeVar.k()) {
                    oxeVar.b();
                } else if (keyCode == 4 || !((oxe) obj).k()) {
                    return false;
                }
            } else if (keyCode == 21) {
                ((oxe) obj).z(-1, zIsCtrlPressed);
            } else if (keyCode == 22) {
                ((oxe) obj).z(1, zIsCtrlPressed);
            } else {
                if (keyCode == 111) {
                    if (keyCode == 4) {
                        return false;
                    }
                    return false;
                }
                oxeVar = (oxe) obj;
                if (!oxeVar.k()) {
                    if (keyCode == 4) {
                        return false;
                    }
                    return false;
                }
                oxeVar.b();
            }
        } else {
            if (i != 4) {
                return false;
            }
            gry gryVar = (gry) this.a;
            adur adurVar = gryVar.g;
            if (adurVar == null || !adurVar.canGoBack()) {
                gryVar.b.finish();
            } else {
                gryVar.g.goBack();
            }
        }
        return true;
    }

    public /* synthetic */ grw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
