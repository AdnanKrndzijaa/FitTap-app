package com.example.fittap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database.getInsance(this).workoutsDao().deleteAll();

        populateDB();
    }
    public void openLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void openRegistration(View view) {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

    public void populateDB(){
        Database.getInsance(this).workoutsDao().add(new Workouts("Hardstyle plank","Do it: \nLying face down on the ground, prop yourself up into a forearm plank position. Make sure your elbows are aligned underneath your shoulders, and that your hands are balled up in fists. Your forearms should be parallel to one another. Hold for 10 to 20 seconds per set.\n" +
                "\n" +
                "Trainer tip: \nYou know planks, right? It’s easy to go through the motions here. Don’t do it. “The key is to squeeze your entire body—quads, glutes, core, back, and fists—as tight as possible while taking diaphoretic breathes throughout the hold,” says Wealth. No matter how many times you’ve done it, this exercise is as difficult as you’re willing to make it.","5 minutes","Ab",R.drawable.abs1 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Dead bug","Do it: \nLay face up on the floor with arms straight above your shoulders. To start, bring your knees directly over your hips and bend at the knee so that your calf forms a 90-degree angle with your thigh. Next, simultaneously lower your left arm above your head while straightening your right leg and sending it towards the floor. Pause, return to the starting position, and then repeat on the opposite side. Do 14 alternating reps to complete one set.\n" +
                "\n" +
                "Trainer tip: \n“Make sure your lower back stays in contact with the floor, and try to keep your breathing as regular as possible,” says Denzel Allen, a StrongFirst trainer in San Francisco. “I like this movement because it helps to train left-right coordination between the upper and lower extremities, which can help improve cognitive function, too.”","5 minutes","Ab",R.drawable.abs2 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Hollow extension-to-cannonball","Do it: \nGet into a cannonball-type shape on your back, hugging your knees into your chest—yes, just like you’re at the pool at summer camp again. Simultaneously extend your legs and arms outwards into a “hollow” position, pressing your lower back to the floor. Hold for five seconds before curling up again, and complete five reps for one set.\n" +
                "\n" +
                "Trainer tip: \n“Engage as much as possible during the extension phase, and use the cannonball for recovery,” suggests Ashley Wilking, Nike master trainer and a trainer at Rumble Boxing. “Just don't completely let go. Think of it like you’re holding a crunch!”","5 minute","Ab",R.drawable.abs3 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Dumbbell side bend","Do it: \nStand with your feet hip-width apart and hold a dumbbell in your right hand, palm facing inwards towards the torso. Keep your back straight, activate your core, and then bend to the side as far as possible—but only at the waist. Hold for one second at the bottom of your range of motion, and return to start for one rep. Do between 12 and 20 reps for one set.\n" +
                "\n" +
                "Trainer tip: \n“Be smart when you pick the weight,” says Wealth. “It shouldn’t feel impossible. Using reasonable weights will help you focus on keeping your abs tight during the exercise for maximum results. And keep that tempo nice and slow.” The real six-pack is not the lift itself—it’s the burning sensation you feel along the way.","5 minutes","Ab",R.drawable.abs4 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Barbell back squat","Do it: \nWith your feet shoulder-width apart, lift a barbell off the rig, centering it evenly across your shoulders. (This version of the squat targets the core, not the legs, and so you should be using far less weight than you would for a traditional back squat.) Send your glutes back like you’re lowering into a chair, bending at the knees as deeply as possible. Press through your heels to return to the starting position for one rep. Do 12 reps for one set.\n" +
                "\n" +
                "Trainer tip: \n“Think about maintaining tension in your abs throughout the entire movement,” says Wealth. “Once you have the movement mastered, you can add additional weights to the barbell. By going up in small increments, though, you’ll stay injury-free.”","3 minutes","Ab",R.drawable.abs5 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Bird dog","Do it: \nThink of this as an upside-down dead bug. Start in a tabletop position, with your shoulders over wrists and hips over knees. Engage your core while simultaneously lifting your right arm and left leg. Your foot should be flexed as you kick back, and your palm should face in towards your body. Pause for one second when your arm and leg are at the same height as your torso, and then bring your elbow and knee to touch underneath the body. Repeat on the other side for one rep, and do five reps for one set.\n" +
                "\n" +
                "Trainer tip: \n“Be careful not to hyperextend your elbows! Maintaining a slight bend fires up those triceps,” says Wilking. “Keep the neck long by looking down and a few inches in front of you, and use the exhale portion of each breath to create tension.”\n" +
                "\n" +
                "Model: Joshua Cummings at Wilhelmina\n" +
                "\n" +
                "Grooming by Barry White","3 minutes","Ab",R.drawable.abs6 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Back squat","How to perform:\n" +
                "\n" +
                "1. Load a barbell on your traps and stand with your feet shoulder-width apart. Your gaze should be ahead, your chest should be proud, and your toes should be pointed slightly out.\n" +
                "2. Sit back into your hips, bend your knees, and drop down toward the floor. Ensure that your knees move slightly out, and do not collapse in.\n" +
                "3. Lower until your thighs are parallel to the ground — or as far down as your mobility allows — then push back up to the starting position.","3 minutes","Leg",R.drawable.legs1 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Front squat","How to perform:\n" +
                "\n" +
                "1. Load a barbell onto the front of your shoulders, hooking your fingers in an underhand grip on either side of your shoulders to support it. Push your elbows up and keep your gaze ahead.\n" +
                "2. Sit back into your hips, bend your knees, and lower down toward the floor. Ensure that your knees track out and your chest stays proud, resisting the pull to fall forward.\n" +
                "3. Lower until your thighs are parallel to the ground — or as far down as your mobility allows — then push back up to the starting position.","3 minute","Leg",R.drawable.legs2));
        Database.getInsance(this).workoutsDao().add(new Workouts("Romanian deadlift","How to perform:\n" +
                "\n" +
                "1. Hold a barbell or one dumbbell in each hand. Keep your back straight and your gaze straight throughout the movement.\n" +
                "2. Begin to hinge forward at your hips, lowering your weight toward the ground with a slight bend in your knees. Allow the weights to closely follow the line of your legs, and lower until you feel a stretch in your hamstrings.\n" +
                "3. Pause, then drive your hips forward to stand up, allowing your glutes to power the movement.","3 minutes","Leg",R.drawable.legs3 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Good mornings","How to perform:\n" +
                "\n" +
                "1. Load a barbell onto your traps and stand with your feet shoulder-width apart.\n" +
                "2. With soft knees, hinge at your hips and slowly move your torso toward the ground, sending your butt backward. Maintain a proud chest and keep your gaze straight throughout the movement.\n" +
                "3. Lower down until you feel a stretch in your hamstring, then use your glutes to return to the starting position.","3 minutes","Leg",R.drawable.legs4 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Walking lunges","How to perform:\n" +
                "\n" +
                "1. Start with your feet together. Hold a dumbbell in each hand if you want to perform a weighted walking lunge.\n" +
                "2. Keeping your chest proud and gaze straight ahead, step forward, lunging with your right leg until your thigh is parallel to the ground.\n" +
                "3. Push up through your right heel, coming back up to the starting position.\n" +
                "4. Continue forward with the left leg.","3 minutes","Leg",R.drawable.legs5 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Reverse lunge","How to perform:\n" +
                "\n" +
                "1. Stand with your feet shoulder-width apart and your arms down at your sides.\n" +
                "2. Step backward with your right foot, lunging until your left leg forms a 90-degree angle. Keep your torso upright.\n" +
                "3. Push back up through your left heel to the starting position.","3 minutes","Leg",R.drawable.legs6 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Lateral lunge","How to perform:\n" +
                "\n" +
                "1. Start with your feet wider than hip-width apart.\n" +
                "2. Bend your left knee, sitting back into your left hip and keeping your torso upright. Keep your right leg as straight as possible, and lower down on your left leg until your knee forms a 90-degree angle.\n" +
                "3. Push back up to the starting position and repeat. Complete the desired number of reps on each side.","3 minutes","Leg",R.drawable.legs7 ));

        Database.getInsance(this).workoutsDao().add(new Workouts("Barbell Bicep Curl","If the Barbell Bicep Curl isn't part of your arm workout, now is the time to include it. Being one of the best exercises for developing muscle mass in the biceps, the utilisation of the barbell allows both arms to work together, shifting more weight during each rep.\n" +
                "\n" +
                "And remember, increasing volume through total weight and reps helps stimulate adaptation in the muscle groups targeted, leading to muscular growth and development.\n" +
                "\n" +
                "TIP: Classic bad form for the bicep curl includes erratic swinging at the bottom of the rep. Keep your feet planted shoulder-width apart, knees slightly bent and elbows kept strictly by your side. Aim for a powerful contraction to the top of the rep, with a slow three-second eccentric movement.","5 minutes","Arm",R.drawable.arms1 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Dumbell Preacher Curl","The beloved preacher curl, the perfect exercise for isolating the biceps brachii. This exercise is well known as the ez bar preacher curl, however switching out the bar for dumbbells allows for unilateral conditioning, ensuring both arms are as strong as each other.\n" +
                "\n" +
                "Utilising the preacher curl bench (or an incline bench) with dumbbells creates one of the best biceps exercises for targeting the muscle, reducing the ability to 'cheat' whilst placing more emphasis on the contraction of the muscle throughout the movement.\n" +
                "\n" +
                "TIP: Rotate your grip for a preacher hammer curl, giving the same amount of isolation, with more focus on the forearm, Brachialis and Brachioradialis.","5 minutes","Arm",R.drawable.arms2 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Cable Bicep Curl","Cable bicep exercises can often be overlooked for the more favourable barbell or dumbbell variations, but you don't need to fall into that same trap. The Cable Bicep Curl is essential for increasing training volume in your arm workouts, often used towards the end of sessions with a higher repetition focus.\n" +
                "\n" +
                "Using the cables for bicep curls creates a 'constant tension' environment for the biceps, making them work uniquely compared to the traditional aforementioned methods.\n" +
                "\n" +
                "TIP: The cable machine can be great for drop sets and working to failure, with the weight pin system making it quick and simple to alter resistance.","5 minutes","Arm",R.drawable.arms3 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Skull Crusher","Otherwise known as the Lying Triceps Extension; If you're chasing big triceps, the skull crusher exercise should be near the top of your list. This triceps exercise is usually performed with the barbell or ez bar, allowing both triceps to work together, targeting all three heads of the triceps brachii.\n" +
                "\n" +
                "Focus on the slow eccentric movement, before powerfully extending your arms, engaging the triceps throughout the exercise.\n" +
                "\n" +
                "TIP: Don't drop the weight; else you'll find out why this exercise is called the 'skull crusher'.","5 minutes","Arm",R.drawable.arms4 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Cable Triceps Pushdown","Utilising the cable machine isn't just for bicep exercises... mounting the attachment higher on the frame allows for an abundance of cable tricep extension exercises to be performed.\n" +
                "\n" +
                "Helping isolate the triceps brachii, the Cable Tricep Pushdown using the straight bar attachment targets the three heads of the triceps.\n" +
                "\n" +
                "The Cable Extension is a great tool for beginners before moving on to more demanding exercises, helping develop muscular conditioning and strength.\n" +
                "\n" +
                "Experienced lifters can also take advantage of the cable system, isolating key areas of the triceps through different tricep extension attachments, including single arm triceps exercises.","5 minutes","Arm",R.drawable.arms5 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Single-arm Dumbell","This exercise provides a unique way to isolate the tricep, lifting the arm above the head to stretch the long head of the muscle placing more emphasis on the contraction.\n" +
                "\n" +
                "You'll need to leave your ego at the door for this lift. The single-arm overhead extension the weight you can shift will be limited, but that doesn't reduce its effectiveness. Start with a light weight and build your way up as your stability, and strength improves.\n" +
                "\n" +
                "Rest assured, this is one of the best dumbbell exercises for triceps to help isolate and target the three heads of the muscle.\n" +
                "\n" +
                "TIP: When standing, ensure you are contracting your abs to hold your body still and prevent your lower back from arching.","5 minutes","Arm",R.drawable.arms6 ));

        Database.getInsance(this).workoutsDao().add(new Workouts("Overhead press","Sets 3 Reps 12 Tempo 2010 Rest 10sec\n" +
                "\n" +
                "Stand tall with a barbell across the front of your shoulders. Brace your core, then press the bar directly overhead. Lower it slowly back to the start.","6 minute","Sholder",R.drawable.sh1 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Push press","Sets 3 Reps 12 Tempo 20X0 Rest 10sec\n" +
                "\n" +
                "Using the same weight as in move 1A, bend your knees to create power to press the bar overhead. Then lower it slowly under complete control.","7 minute","Sholder",R.drawable.sh2 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Barbell shrug","Sets 3 Reps 12 Tempo 1111 Rest 90sec\n" +
                "\n" +
                "Lower the bar to thigh level then, keeping your arms straight, shrug the bar up so that your shoulders reach your ears. Hold this top position for a second, then lower it back to the start.","5 minute","Sholder",R.drawable.sh3 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Seated Arnold press","Sets 3 Reps 12 Tempo 2111 Rest 10sec\n" +
                "\n" +
                "Sit holding a dumbbell in each hand with palms facing you. Press them up overhead, rotating your wrists as you go, so you end with straight arms and palms facing away.","5 minute","Sholder",R.drawable.sh4 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Seated lateral raise","Sets 3 Reps 12 Tempo 2111 Rest 10sec\n" +
                "\n" +
                "Switch to lighter dumbbells then, leaning forward slightly, raise them to shoulder height, leading with your elbows. Pause at the top, then lower back under control.","10 minute","Sholder",R.drawable.sh5 ));
        Database.getInsance(this).workoutsDao().add(new Workouts("Bent-over reverse flye","Sets 3 Reps 12 Tempo 2111 Rest 90sec\n" +
                "\n" +
                "Stand up and, using the same weights as 2B, bend forwards from your hips. Lead with your elbows to raise the weights to shoulder height. Pause, then lower back under control.","8 minute","Sholder",R.drawable.sh6 ));



    }

}