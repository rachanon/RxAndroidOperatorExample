package com.rxandroid.example.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rxandroid.example.R;
import com.rxandroid.example.databinding.FragmentMainBinding;
import com.rxandroid.example.operator.AsyncSubjectExampleActivity;
import com.rxandroid.example.operator.BehaviorSubjectExampleActivity;
import com.rxandroid.example.operator.BufferExampleActivity;
import com.rxandroid.example.operator.CompletableObserverExampleActivity;
import com.rxandroid.example.operator.ConcatExampleActivity;
import com.rxandroid.example.operator.DebounceExampleActivity;
import com.rxandroid.example.operator.DeferExampleActivity;
import com.rxandroid.example.operator.DelayExampleActivity;
import com.rxandroid.example.operator.DisposableExampleActivity;
import com.rxandroid.example.operator.DistinctExampleActivity;
import com.rxandroid.example.operator.FilterExampleActivity;
import com.rxandroid.example.operator.FlowableExampleActivity;
import com.rxandroid.example.operator.IntervalExampleActivity;
import com.rxandroid.example.operator.LastOperatorExampleActivity;
import com.rxandroid.example.operator.MapExampleActivity;
import com.rxandroid.example.operator.MergeExampleActivity;
import com.rxandroid.example.operator.PublishSubjectExampleActivity;
import com.rxandroid.example.operator.ReduceExampleActivity;
import com.rxandroid.example.operator.ReplayExampleActivity;
import com.rxandroid.example.operator.ReplaySubjectExampleActivity;
import com.rxandroid.example.operator.ScanExampleActivity;
import com.rxandroid.example.operator.SimpleExampleActivity;
import com.rxandroid.example.operator.SingleObserverExampleActivity;
import com.rxandroid.example.operator.SkipExampleActivity;
import com.rxandroid.example.operator.TakeExampleActivity;
import com.rxandroid.example.operator.ThrottleFirstExampleActivity;
import com.rxandroid.example.operator.ThrottleLastExampleActivity;
import com.rxandroid.example.operator.TimerExampleActivity;
import com.rxandroid.example.operator.WindowExampleActivity;
import com.rxandroid.example.operator.ZipExampleActivity;

/**
 * Created by Nonnie on 10/9/2017 AD.
 */

public class MainFragment extends Fragment implements IMainScreen {

    public static MainFragment newInstance(){
        return new MainFragment();
    }

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState) {

        FragmentMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        MainHandler handler = new MainHandler(this);

        binding.setHandler(handler);

        return binding.getRoot();
    }

    @Override public void startSimpleActivity() {
        startActivity(new Intent(getContext(), SimpleExampleActivity.class));
    }

    @Override public void startMapActivity() {
        startActivity(new Intent(getContext(), MapExampleActivity.class));
    }

    @Override public void startZipActivity() {
        startActivity(new Intent(getContext(), ZipExampleActivity.class));
    }

    @Override public void startDisposableActivity() {
        startActivity(new Intent(getContext(), DisposableExampleActivity.class));
    }

    @Override public void startTakeActivity() {
        startActivity(new Intent(getContext(), TakeExampleActivity.class));
    }

    @Override public void startTimerActivity() {
        startActivity(new Intent(getContext(), TimerExampleActivity.class));
    }

    @Override public void startIntervalActivity() {
        startActivity(new Intent(getContext(), IntervalExampleActivity.class));
    }

    @Override public void startSingleObserverActivity() {
        startActivity(new Intent(getContext(), SingleObserverExampleActivity.class));
    }

    @Override public void startCompletableObserverActivity() {
        startActivity(new Intent(getContext(), CompletableObserverExampleActivity.class));
    }

    @Override public void startFlowableActivity() {
        startActivity(new Intent(getContext(), FlowableExampleActivity.class));
    }

    @Override public void startReduceActivity() {
        startActivity(new Intent(getContext(), ReduceExampleActivity.class));
    }

    @Override public void startBufferActivity() {
        startActivity(new Intent(getContext(), BufferExampleActivity.class));
    }

    @Override public void startFilterActivity() {
        startActivity(new Intent(getContext(), FilterExampleActivity.class));
    }

    @Override public void startSkipActivity() {
        startActivity(new Intent(getContext(), SkipExampleActivity.class));
    }

    @Override public void startScanActivity() {
        startActivity(new Intent(getContext(), ScanExampleActivity.class));
    }

    @Override public void startReplayActivity() {
        startActivity(new Intent(getContext(), ReplayExampleActivity.class));
    }

    @Override public void startConcatActivity() {
        startActivity(new Intent(getContext(), ConcatExampleActivity.class));
    }

    @Override public void startMergeActivity() {
        startActivity(new Intent(getContext(), MergeExampleActivity.class));
    }

    @Override public void startDeferActivity() {
        startActivity(new Intent(getContext(), DeferExampleActivity.class));
    }

    @Override public void startDistinctActivity() {
        startActivity(new Intent(getContext(), DistinctExampleActivity.class));
    }

    @Override public void startLastOperatorActivity() {
        startActivity(new Intent(getContext(), LastOperatorExampleActivity.class));
    }

    @Override public void startReplaySubjectActivity() {
        startActivity(new Intent(getContext(), ReplaySubjectExampleActivity.class));
    }

    @Override public void startPublishSubjectActivity() {
        startActivity(new Intent(getContext(), PublishSubjectExampleActivity.class));
    }

    @Override public void startBehaviorSubjectActivity() {
        startActivity(new Intent(getContext(), BehaviorSubjectExampleActivity.class));
    }

    @Override public void startAsyncSubjectActivity() {
        startActivity(new Intent(getContext(), AsyncSubjectExampleActivity.class));
    }

    @Override public void startThrottleFirstActivity() {
        startActivity(new Intent(getContext(), ThrottleFirstExampleActivity.class));
    }

    @Override public void startThrottleLastActivity() {
        startActivity(new Intent(getContext(), ThrottleLastExampleActivity.class));
    }

    @Override public void startDebounceActivity() {
        startActivity(new Intent(getContext(), DebounceExampleActivity.class));
    }

    @Override public void startWindowActivity() {
        startActivity(new Intent(getContext(), WindowExampleActivity.class));
    }

    @Override public void startDelayActivity() {
        startActivity(new Intent(getContext(), DelayExampleActivity.class));
    }
}
