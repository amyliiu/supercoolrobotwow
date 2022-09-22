// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.IOConstants;
import frc.robot.commands.Cartesian;
//import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.PIDShooter;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  private final Drivetrain _drive = new Drivetrain();
  //private final MecanumDrivetrain _drive = new MecanumDrivetrain();
  //private final PIDShooter p_shoot = new PIDShooter();
  //private final Winch m_winch = new Winch();
  
  //Commands
  
  //Controllers
  private final Joystick _joystickOne = new Joystick(IOConstants.LEFT_JOYSTICK); //Controller for translation
  private final Joystick _joystickTwo = new Joystick(IOConstants.RIGHT_JOYSTICK); //Controller for rotation    private final XboxController m_Controller = new XboxController(IOConstants.MAIN_CONTROLLER);
  private final XboxController m_Controller = new XboxController(IOConstants.MAIN_CONTROLLER);

  //UsbCamera _cam = CameraServer.startAutomaticCapture();
  ShuffleboardTab m_tab = Shuffleboard.getTab("Main"); //grid to display info,, useful for adjusting
  //private PathChooser pathChooser = new PathChooser();
 
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    _drive.setDefaultCommand(new Cartesian(_drive, () -> m_Controller.getLeftY(),() -> m_Controller.getRightX(), () -> -m_Controller.getLeftX()));
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //new JoystickButton(m_Controller, XboxController.Button.kStart.value).whenHeld( new Cartesian(m_drive,, _x, _z))
    //new JoystickButton(m_Controller, XboxController.Button.kBack.value).whenHeld(new DriveBack(m_drive));
    //new JoystickButton(_joystickOne, 1).whenHeld(new ReverseDrive(m_drive));
    //new JoystickButton(m_Controller, XboxController.Button.kStart.value).whenPressed(new ToggleSolomon(m_winch));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}
